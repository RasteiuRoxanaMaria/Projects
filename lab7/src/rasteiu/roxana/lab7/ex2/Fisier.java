package rasteiu.roxana.lab7.ex2;

import java.io.*;

public class Fisier {
    public static void main(String[] args) throws Exception{
        FileReader f=new FileReader("C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex2\\data.txt");
        int i,count=0;
        System.out.println("The character you are looking for is:");
        char c = ( char ) System.in.read();
        while((i=f.read())!= -1){
            if((char) i==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
