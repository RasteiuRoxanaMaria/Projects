package rasteiu.roxana.lab7.ex1;

public class CofeeDrinker {
    void drinkCofee(Cofee c) throws TemperatureException, ConcentrationException{
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Coffe is to hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Coffe concentration to high");
        System.out.println("Drink coffe: "+c);
    }
}
