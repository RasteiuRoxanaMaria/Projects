package rasteiu.roxana.lab8.ex3;

public class Segment {
    public int id;
    private Train train;

    Segment(int id){

        this.id=id;
    }

    public boolean hasTrain(){
        return train!=null;
    }

    public Train departTrain(){
        Train tmp=train;
        this.train=null;
        return tmp;
    }

    void arriveTrain(Train t){

        train=t;
    }

    public Train getTrain(){

        return train;
    }
}
