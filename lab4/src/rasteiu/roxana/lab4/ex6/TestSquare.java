package rasteiu.roxana.lab4.ex6;

public class TestSquare {
    public static void main(String args[])
    {
        Square s1=new Square();
        Square s2=new Square(5);
        Square s3=new Square(2, "red",true);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s3.getPerimeter());
    }
}
