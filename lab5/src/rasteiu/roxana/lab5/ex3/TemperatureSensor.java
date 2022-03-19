package rasteiu.roxana.lab5.ex3;

import java.util.*;

public class TemperatureSensor extends Sensor {

    Random random = new Random();
    public int readValue() {
        return random.nextInt(100); //return random number between 0-100
    }
}

