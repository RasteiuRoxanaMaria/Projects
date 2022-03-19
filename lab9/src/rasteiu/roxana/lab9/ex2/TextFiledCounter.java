package rasteiu.roxana.lab9.ex2;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;

public class TextFiledCounter implements ActionListener{

    JButton bcounter=new JButton("Counter Button");
    JTextField tcounter = new JTextField(15);
    JFrame f=new JFrame();
    int i=0;

     public TextFiledCounter() {

         tcounter.setText("" + i);
         f.setVisible(true);
         f.setSize(200, 250);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setResizable(true);
         f.setLayout(new FlowLayout());
         f.add(tcounter);
         f.add(bcounter);
         bcounter.addActionListener(this);

     }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bcounter){
            i++;
            tcounter.setText(""+i);
        }
    }

    public static void main(String[] args) {
        new TextFiledCounter();
    }
}


