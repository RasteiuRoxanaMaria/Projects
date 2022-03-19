package rasteiu.roxana.lab4.ex4;

import rasteiu.roxana.lab4.ex2.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock;

    Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors=authors;
        this.price = price;
    }

    Book(String name, Author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    void printAuthors() {
        for(int i=0;i<authors.length;i++) {
            System.out.println(authors[i].getName());
        }
    }

    @Override
    public String toString(){
        return(name+" by " + authors.length + " authors");

    }
}
