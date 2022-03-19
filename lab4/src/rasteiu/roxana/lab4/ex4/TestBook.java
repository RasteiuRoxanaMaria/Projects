package rasteiu.roxana.lab4.ex4;

import rasteiu.roxana.lab4.ex2.Author;

public class TestBook {

        public static void main(String args[]){

            Author[] authors=new Author[3];
            authors[0]=new Author("Rasteiu Roxana","roxana.rasteiu@yahoo.com ",'f');
            authors[1]=new Author("Irina Binder ","irina.binder@yahoo.com ",'f');
            authors[2]=new Author("Paula Hawkins ","paula.hawkins@yahoo.com ",'f');
            Book b1=new Book("Tablou",authors,18);
            System.out.println(b1);
            b1.printAuthors();


        }

}
