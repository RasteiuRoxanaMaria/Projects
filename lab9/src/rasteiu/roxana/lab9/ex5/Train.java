package rasteiu.roxana.lab9.ex5;

public class Train {
    private String destination;
    private String name;

    public Train(String destinatie, String nume){
        super();
        this.destination=destinatie;
        this.name=nume;
    }

    public String getDestination(){
        return destination;
    }

    public String getName() {
        return name;
    }
}
