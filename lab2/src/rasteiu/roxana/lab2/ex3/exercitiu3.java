package rasteiu.roxana.lab2.ex3;
import java.util.*;
public class exercitiu3 {
    static int prime(int n){
        int ok;
        ok=1;
        for(int d=2; d<n/2; d++) {
            if (n % d ==0)
            {
                ok=0;
                break;
            }
        }
        return ok;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("a= ");
        int a = in.nextInt();
        System.out.print("b= ");
        int b = in.nextInt();
        for(int d=a; d<=b; d++) {
            if ( prime(d)==1 )
            {
                System.out.println(d);
            }
        }

    }
}
