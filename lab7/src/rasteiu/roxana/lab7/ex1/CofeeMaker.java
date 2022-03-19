package rasteiu.roxana.lab7.ex1;

public class CofeeMaker {
    private static int number;
    Cofee makeCofee() throws NumberException{
        System.out.println("Make a coffe");
        int t=(int)(Math.random()*100);
        int c=(int)(Math.random()*100);
        number++;
        Cofee cofee=new Cofee(t,c);
        if(number>3)
        {
            throw new NumberException(number,"Cofee has to many instancies!");
        }
        return cofee;
    }
    int getNumber(){
        return number;
    }
}
