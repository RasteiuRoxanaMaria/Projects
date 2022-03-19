package rasteiu.roxana.lab5.ex1;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape()
    {
       color="red";
       filled=true;
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=true;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public boolean isFilled() {

        return filled;
    }

    public void setFilled(boolean filled) {

        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString()
    {
        return "a shape with color: " + this.color +" and filled: " +this.filled;
    }
}
