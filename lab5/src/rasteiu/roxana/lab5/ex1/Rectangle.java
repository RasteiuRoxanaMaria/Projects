package rasteiu.roxana.lab5.ex1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        width=1.1;
        length=2.2;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        double l=getLength();
        double w=getWidth();
        return l*w;
    }
    @Override
    public double getPerimeter(){
        double l=getLength();
        double w=getWidth();
        return l+w;
    }
    @Override
    public String toString(){
        return  "A Rectangle with width= " + width + " and length= " + length + " which is a subclass of " + super.toString();
    }

}
