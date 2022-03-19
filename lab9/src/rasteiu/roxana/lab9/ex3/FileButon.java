package rasteiu.roxana.lab9.ex3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.*;
import java.io.FileReader;
import java.util.*;

public class FileButon extends JFrame{

    HashMap accounts = new HashMap();

    JLabel file;
    JTextField tFile;
    JTextArea tArea;
    JButton bLoghin;

    FileButon(){

        accounts.put("file.txt","file.txt");

        setTitle("Test login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(200,300);
        setVisible(true);
    }

    public void init(){

        this.setLayout(null);
        int width=80;int height = 20;

        file = new JLabel("Nume Fisier ");
        file.setBounds(10, 50, width, height);

        tFile = new JTextField();
        tFile.setBounds(80,50,width, height);

        bLoghin = new JButton("Load");
        bLoghin.setBounds(50,90,width, height);

        bLoghin.addActionListener(new TratareButonLoghin());

        tArea = new JTextArea();
        tArea.setBounds(15,130,150,80);

        add(file);
        add(tFile);
        add(bLoghin);
        add(tArea);

    }


    public static void main(String[] args)  {

        new FileButon();
    }

    class TratareButonLoghin implements ActionListener {

        private String c="";

        public void citire()throws Exception{
            FileReader f=new FileReader("C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab9\\src\\rasteiu\\roxana\\lab9\\ex3\\file.txt");
            int i,count=0;
            String c="" ;
            while((i=f.read())!= -1){
                this.c = this.c + (char)i;
            }
        }

        public void actionPerformed(ActionEvent e) {

            String usr = FileButon.this.tFile.getText();

            if(FileButon.this.accounts.containsKey(usr)){
                String name = (String)FileButon.this.accounts.get(usr);
                if(name.equals(tFile)==false){
                    try {
                        citire();
                        FileButon.this.tArea.append(this.c+"\n");
                    } catch (Exception e1) {
                       e1.printStackTrace();
                    }

                }
            }else{
                FileButon.this.tArea.append("File not found\n");
            }

        }
    }
}
