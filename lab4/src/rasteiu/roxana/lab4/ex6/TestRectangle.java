package rasteiu.roxana.lab4.ex6;

public class TestRectangle {
    public static void main(String args[]) {

        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(2, 8);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(4, 6, "green", false);
        System.out.println(r3);
        r1.setWidth(5);
        System.out.println(r1.getWidth());
        r2.setLength(12);
        System.out.println(r2.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
