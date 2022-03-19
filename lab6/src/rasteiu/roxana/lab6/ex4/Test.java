package rasteiu.roxana.lab6.ex4;

import java.util.*;
import java.io.*;

public class Test {
    public static void main(String args[]) throws Exception{
        String word;
        String definition;

        Dictionary dictionary = new Dictionary();
        Scanner input = new Scanner(System.in);
        int option=0;

        while (option != 5) {
            System.out.println("Enter an option: ");
            System.out.println("1. Add Word");
            System.out.println("2. Get Definition for a Word");
            System.out.println("3. Get All Words ");
            System.out.println("4. Get All Definitions");
            System.out.println("5. Exit");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("Enter the new Word that you want to add: ");
                    word = input.next();
                    System.out.println("Enter its Definition: ");
                    definition = input.next();
                    dictionary.addWord(new Word(word), new Definition(definition));
                    break;
                case 2:
                    System.out.println("Enter the Word for which you want a definition: ");
                    word = input.next();
                    Word w = new Word(word);
                    System.out.print(dictionary.getDefinition(w));
                    break;
                case 3:
                    dictionary.getAllWords();
                    break;
                case 4:
                    dictionary.getAllDefinitions();
                    break;
                case 5:
                    System.out.println("Process finished");
            }
        }

    }
}