package rasteiu.roxana.lab5.ex1;

public  class Circle extends Shape {
    protected double radius;
    public Circle(){
          radius=1.0;
    }

    public Circle(double radius){

        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
       double r=getRadius();
       return 3.14*r*r;
    }
    @Override
    public double getPerimeter(){
        double r=getRadius();
        return 3.14*2*r;
    }
    @Override
    public String toString(){
        return "A circle with radius= " + radius + " which is a subclass of " + super.toString();    }

}
