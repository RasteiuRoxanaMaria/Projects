package rasteiu.roxana.lab7.ex3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class encryptdecrypt {
    public static void main(String[] args) throws Exception {
        System.out.print("Choose de operation: ");
        System.out.print("1.Encrypt ");
        System.out.print("2.Decrypt");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            FileWriter g=new FileWriter("C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex3\\data.enc.txt");
            FileReader f=new FileReader("C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex3\\data.dec.txt");
            int i;
            while((i=f.read())!=-1){
                g.write((char) (i-1));
            }
            g.close();
        }
        if(n==2) {
            FileWriter g= new FileWriter("C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex3\\data.dec.txt");
            FileReader f=new FileReader("C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex3\\data.enc.txt");
            int i;
            while((i=f.read())!=-1){
                g.write((char) (i+1));
            }
            g.close();
        }
    }
}
