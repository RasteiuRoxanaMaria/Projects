package rasteiu.roxana.lab7.ex4;

public class TestCar {
    public static void main(String[] args) throws Exception{
        CarObject c=new CarObject();
        Car c1=c.createCar("abc",123.90);
        Car c2=c.createCar("efg",435.30);
        c.WriteCar(c1,"C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex4\\date.txt");
        c.WriteCar(c2,"C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex4\\date.txt");
        Car x=c.ReadCar("C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex4\\date.txt");
        Car y=c.ReadCar("C:\\Users\\Roxy\\IdeaProjects\\rasteiu-roxana-30126-isp-2019\\lab7\\src\\rasteiu\\roxana\\lab7\\ex4\\date.txt");
        System.out.println(x);
        System.out.println(y);
    }
}
