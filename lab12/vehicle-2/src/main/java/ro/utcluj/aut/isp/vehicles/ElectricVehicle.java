package ro.utcluj.aut.isp.vehicles;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String type, int length) {
        super(type, length);
    }
    @Override
    public String start(){
        return "electric engine started";
    }
}