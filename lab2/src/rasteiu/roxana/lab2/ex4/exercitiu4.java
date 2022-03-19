package rasteiu.roxana.lab2.ex4;
import java.util.*;
public class exercitiu4 {
    static void maxim(){
        Scanner in = new Scanner(System.in);
        System.out.print("n= ");
        int n = in.nextInt();
        int [] v = new int[n];
        for(int i=0;i<n;i++){
            v[i] = in.nextInt();
        }
        int max=v[0];
        for(int i=0;i<n;i++){
            if(v[i] > max)
            {
                max=v[i];
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        maxim();
    }
}
