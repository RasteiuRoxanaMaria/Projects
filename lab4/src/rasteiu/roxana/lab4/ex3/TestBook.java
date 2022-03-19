package rasteiu.roxana.lab4.ex3;

import rasteiu.roxana.lab4.ex2.Author;

public class TestBook {

    public static void main(String args[]) {
        Author author1 = new Author("Irina Binder", "irina.binder@yahoo.com", 'f');
        Book b1 = new Book("Fluturi", author1, 22.45);
        System.out.println(b1);
    }

}
