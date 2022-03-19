package rasteiu.roxana.lab2.ex7;
import java.util.*;
public class exercitiu7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int nr=r.nextInt(99);
        int n;
        int ok=0;
        for(int i=0;i<3;i++)
        {
            System.out.print("n= ");
            n = in.nextInt();
            if (n == nr) {
                ok=1;
                System.out.println("Ai ghicit numarul!");
                break;
            } else if (n > nr) {
                System.out.println("Raspuns gresit, numarul este prea mare!");
            } else if (n < nr) {
                System.out.println("Raspuns gresit, numarul este prea mic!");
            }
        }
        if (ok==0) {
            System.out.println("Ai pierdut!");
            System.out.println("Numarul este "+ nr);
        }
    }
}
