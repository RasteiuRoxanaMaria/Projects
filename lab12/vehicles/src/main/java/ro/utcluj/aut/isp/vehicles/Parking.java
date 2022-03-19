package ro.utcluj.aut.isp.vehicles;

import java.util.*;


public class Parking {

    /**
     * Vehicles will be parked in parkedVehicles array.
     */
    ArrayList<Vehicle> parkedVehicles=new ArrayList<>();

    public void parkVehicle(Vehicle e){
       parkedVehicles.add(e);
    }

    /**
     * Sort vehicles by length.
     */
    public void sortByWeight(){
        Comparator<Vehicle>ve = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(parkedVehicles,ve);
    }

    public Vehicle get(int index){
        return parkedVehicles.get(index);
    }

}
