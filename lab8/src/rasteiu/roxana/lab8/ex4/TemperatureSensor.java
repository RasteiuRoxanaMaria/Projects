package rasteiu.roxana.lab8.ex4;

import java.util.Random;

public class TemperatureSensor {
    private Random r = new Random();
    int k = r.nextInt(100);

    public int getTemperatureSensor(){
        return k;
    }
}
