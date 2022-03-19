package rasteiu.roxana.lab8.ex4;

public class GsmUnit {
    private String phoneNr;
    public GsmUnit(String phoneNr)
    {
        this.phoneNr=phoneNr;
    }
    @Override
    public String toString()
    {
        return ("The owner that is going to be called has the phone number :"+ phoneNr);
    }
}
