package rasteiu.roxana.lab8.ex3;

import java.util.*;

public class Controler {
    private String stationName;
    List<Controler> neighbourController=new ArrayList<Controler>();
    ArrayList<Segment>list=new ArrayList<Segment>();

    public Controler(String gara){

        stationName=gara;
    }

    void setNeighbourController(Controler v){
        neighbourController.add(v);
    }

    void addControlledSegment(Segment s){
        list.add(s);
    }

    int getFreeSegmentId(){
        for(Segment s:list){
            if(s.hasTrain()==false)
                return s.id;
        }
        return -1;
    }
    void controlStep(){
        for(Segment segment:list){
            if(segment.hasTrain()){
                Train t = segment.getTrain();

           for (Controler con:neighbourController) {
            if (t.getDestination().equals(con.stationName)) {
                int id = con.getFreeSegmentId();
                if (id == -1) {
                    System.out.println("Trenul +" + t.getName() + "din gara " + stationName + " nu poate fi trimis catre " + con.stationName + ". Nici un segment disponibil!");
                    return;
                }
                System.out.println("Trenul " + t.getName() + " pleaca din gara " + stationName + " spre gara " + con.stationName);
                segment.departTrain();
                con.arriveTrain(t, id);
            }
            }
          }
        }

    }
    public void arriveTrain(Train t, int idSegment){
        for(Segment segment:list){
            if(segment.id == idSegment)
                if(segment.hasTrain()==true){
                    System.out.println("CRASH! Train "+t.getName()+" colided with "+segment.getTrain().getName()+" on segment "+segment.id+" in station "+stationName);
                    return;
                }else{
                    System.out.println("Train "+t.getName()+" arrived on segment "+segment.id+" in station "+stationName);
                    segment.arriveTrain(t);
                    return;
                }
        }

        System.out.println("Train "+t.getName()+" cannot be received "+stationName+". Check controller logic algorithm!");

    }


    public void displayStationState(){
        System.out.println("=== STATION "+stationName+" ===");
        for(Segment s:list){
            if(s.hasTrain())
                System.out.println("|----------ID="+s.id+"__Train="+s.getTrain().getName()+" to "+s.getTrain().getDestination()+"__----------|");
            else
                System.out.println("|----------ID="+s.id+"__Train=______ catre ________----------|");
        }
    }

}