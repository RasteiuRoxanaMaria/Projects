package rasteiu.roxana.lab4.ex1;

public class TestCircle {

        public static void main(String[] args) {
            Circle c1=new Circle();
            Circle c2=new Circle(0.1);
            Circle c3=new Circle("red");
            double a1=c1.getRadius();
            double a2=c2.getRadius();
            double a3=c3.getRadius();
            double b1=c1.getArea();
            double b2=c2.getArea();
            double b3=c3.getArea();
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
        }
}
