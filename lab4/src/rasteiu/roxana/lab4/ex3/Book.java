package rasteiu.roxana.lab4.ex3;

import rasteiu.roxana.lab4.ex2.Author;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock=0;
    public Book(String name,Author author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public Book(String name, Author author, double price, int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    public String getName(){

        return name;
    }
    public Author getAuthor(){

        return author;
    }
    public double getPprice(){
        return price;
    }
    public int getQtyInStock(){

        return qtyInStock;
    }
    public void setPrice(double price){

        this.price=price;
    }
    public String toString() {

        return ("Book name " + name + " , by " + author.getName() + "( "+ author.getGender() + ")" + ", at " + author.getEmail())  ;
    }


}
