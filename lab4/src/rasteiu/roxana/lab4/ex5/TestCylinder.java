package rasteiu.roxana.lab4.ex5;

public class TestCylinder {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        Cylinder c2=new Cylinder(3.3);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c1.getVolume());
        System.out.println(c2.getVolume());
    }
}
