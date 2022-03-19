package rasteiu.roxana.lab7.ex4;

import java.io.*;

public class Car implements Serializable {
    public String model;
    public double price;
    public Car(String model, double price){
        this.model=model;
        this.price=price;
    }
    public void move(){
        System.out.println("Car is moving."+this);
    }
    public String toString(){
        return "[car= "+model+" :price= "+price+"]";
    }
}
