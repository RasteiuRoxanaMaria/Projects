package rasteiu.roxana.lab12.ex2;

import javax.swing.*;

public class Stock extends JFrame {
    JTextArea view;
    JButton bview,badd,bdelete;
    JTextField aname,aquantity,aprice;
    Stock(){
        setTitle("Stock Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(700,700);
        setVisible(true);
    }
    public void init(){
        this.setLayout(null);
        int width=80; int height=20;
        view=new JTextArea();
        view.setBounds(100,10,150,80);
        bview=new JButton("View");
        bview.setBounds(10,10,70,30);
        badd=new JButton("ADD");
        badd.setBounds(10,110,70,30);

        add(view);
        add(bview);
        add(badd);
    }
    public static void main(String[] args) {
        new Stock();
    }
}
