package rasteiu.roxana.lab5.ex4;

import rasteiu.roxana.lab5.ex3.TemperatureSensor;
import rasteiu.roxana.lab5.ex3.LightSensor;

public class TestController {
    public static void main(String args[]){
        TemperatureSensor temp = new TemperatureSensor();
        LightSensor light = new LightSensor();

        Controller c = new Controller(temp,light);
        for(int i=0; i<20; i++){
            c.control();
        }
    }

}
