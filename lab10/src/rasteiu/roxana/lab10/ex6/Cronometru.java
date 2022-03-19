package rasteiu.roxana.lab10.ex6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class Cronometru extends JFrame {

    HashMap accounts = new HashMap();

    Crono c = new Crono();
    static boolean state = true;
    boolean OK = true;
    JButton start, pause, reset;
    static JTextField chronometer;

    Cronometru() {
        setTitle("Cronometru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(500, 500);
        setVisible(true);
    }

    public void init() {
        this.setLayout(null);
        int width = 70;
        int height = 40;

        chronometer = new JTextField();
        chronometer.setBounds(150, 40, 150, 30);

        start = new JButton("Start");
        start.setBounds(80, 100, width, height);

        pause = new JButton("Pause");
        pause.setBounds(180, 100, width, height);

        reset = new JButton("Reset");
        reset.setBounds(280, 100, width, height);

        add(start);
        add(chronometer);
        add(pause);
        add(reset);

        reset.addActionListener(new ResetButton());
        start.addActionListener(new StartButton());
        pause.addActionListener(new StopButton());
    }

    class ResetButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == reset) {
                c.resetChronometer();
            }
        }
    }

    class StartButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == start) {
                state = true;
                if (OK) {
                    c.start();
                    OK = false;
                } else {
                    c.startChronometer();
                }
            }
        }
    }

    class StopButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == pause) {
                state = false;
            }
        }
    }


    class Crono extends Thread {
        int milliseconds = 0;
        int seconds = 0;
        int minutes = 0;
        int hours = 0;

        Crono() {
        }

        ;

        public void run() {
            try {

                synchronized (this) {

                    while (true) {

                        Cronometru.chronometer.setText(hours + " :" + minutes + " :" + seconds + " ." + milliseconds);
                        Thread.sleep(1);
                        milliseconds++;
                        if (milliseconds == 1000) {
                            milliseconds = 0;
                            seconds++;
                        }
                        if (seconds == 60) {
                            milliseconds = 0;
                            seconds = 0;
                            minutes++;
                        }
                        if (minutes == 60) {
                            milliseconds = 0;
                            seconds = 0;
                            minutes = 0;
                            hours++;
                        }
                        if (!Cronometru.state) {
                            wait();
                        }
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public void resetChronometer() {

            this.milliseconds = 0;
            this.seconds = 0;
            this.minutes = 0;
            this.hours = 0;
            Cronometru.chronometer.setText(hours + " :" + minutes + " :" + seconds + " ." + milliseconds);

        }

        public void startChronometer() {
            synchronized (this) {
                if (Cronometru.state)
                    notify();
            }
        }
    }

    public static void main(String[] args) {
        Cronometru c = new Cronometru();
    }
}
