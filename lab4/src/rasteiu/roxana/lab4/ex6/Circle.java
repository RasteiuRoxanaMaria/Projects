package rasteiu.roxana.lab4.ex6;

public class Circle extends Shape {
    private double radius=1.0;
    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle (double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        double r=this.radius;
        double a=3.14*r*r;
        return a;
    }
    public double getPerimeter(){
        double r=this.radius;
        double p=2*3.14*r;
        return p;
    }
    @Override

    public String toString(){
       return "A circle with radius= " + radius + "which is a subclass of " + super.toString();
    }

}
