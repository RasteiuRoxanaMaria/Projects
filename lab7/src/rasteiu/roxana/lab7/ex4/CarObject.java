package rasteiu.roxana.lab7.ex4;

import java.io.*;
import java.util.*;

public class CarObject {
    Car createCar(String name, double cost ){
        Car z=new Car(name, cost);
        System.out.println(z+" is alive.");
        return z;
    }
    void WriteCar(Car a, String str) throws IOException{
        ObjectOutputStream o= new ObjectOutputStream( new FileOutputStream(str));
        o.writeObject(a);
        System.out.println(a+":I'll be back.");
    }
    Car ReadCar(String str) throws IOException, ClassNotFoundException{
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(str));
        Car x=(Car)in.readObject();
        System.out.println(x+":I'm back.");
        return x;
    }
}
