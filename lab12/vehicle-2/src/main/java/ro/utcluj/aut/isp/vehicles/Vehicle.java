package ro.utcluj.aut.isp.vehicles;

import java.util.Objects;


public class Vehicle  implements Comparable<Vehicle> {

    private String type;
    private int weight;

    public Vehicle(String type, int length) {
        this.type = type;
        this.weight=length;
    }

    public String start(){
        return "engine started";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Vehicle){
            Vehicle p=(Vehicle)obj;
            return type==p.type;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight);
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.weight-o.weight;
    }
}
