package rasteiu.roxana.lab2.ex5;
import java.util.*;
public class exercitiu5 {
    static void bubblesort(int [] a){

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 10-i-1; j++)
                if (a[j] > a[j+1])
                {
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }

        for(int i=0;i<a.length;i++){
            System.out.print("a["+i+"]="+a[i]+" ");
        }

    }

    public static void main(String[] args) {

        Random r = new Random();

        int[] a = new int[10];

        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt(100);
        }

        bubblesort(a);


    }
}
