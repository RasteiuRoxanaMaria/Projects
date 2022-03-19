package rasteiu.roxana.lab3.ex5;

public class Flower {
    int petal;
    static int numar=0;
    Flower(int p){
        petal=p;
        System.out.println("New flower has been created!");
        numar++;
    }

    static int count(){
        return numar;
    }


    public static void main(String[] args) {
        Flower f1 = new Flower(4);
        Flower f2 = new Flower(6);
        System.out.println("Numarul de flori create " + count());
    }
}
