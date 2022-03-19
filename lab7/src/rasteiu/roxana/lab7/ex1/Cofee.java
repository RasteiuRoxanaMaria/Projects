package rasteiu.roxana.lab7.ex1;

public class Cofee {
    private int temp;
    private int conc;
    Cofee(int t, int c){
        temp=t;
        conc=c;
        }
    int getTemp(){

            return temp;
    }
    int getConc(){

            return conc;
    }
    public String toString(){

            return"Coffe temperature= "+temp+" :concentration= "+ conc;
    }
}
