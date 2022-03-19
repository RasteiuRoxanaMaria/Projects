package rasteiu.roxana.lab7.ex1;

public class NumberException extends Exception {
    int number;
    public NumberException(int number, String msg) {
        super(msg);
        this.number = number;

    }
    int getNumber(){

        return number;
    }
}