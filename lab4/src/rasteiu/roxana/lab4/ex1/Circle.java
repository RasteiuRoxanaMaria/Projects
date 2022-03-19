package rasteiu.roxana.lab4.ex1;

public class Circle {
    private double radius;
    private String color;
   public Circle(){
        this.radius=1.0;
        this.color="Red";
    }

    public Circle(double radius) {
        this.radius=radius;
        this.color = "Black";
    }

    public Circle(String color) {
        this.color = color;
        this.radius=1.1;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double r=getRadius();
        return (3.14*(r*r));
    }
}
