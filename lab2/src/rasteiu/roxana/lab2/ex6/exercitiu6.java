package rasteiu.roxana.lab2.ex6;
import java.util.*;
public class exercitiu6 {
    static int factorial_nerecursiv(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }

    static int factorial_recursiv(int n){
        if(n== 0)
        {
            return 1;
        }
        else
        {
            return n* factorial_recursiv(n-1);

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n= ");
        int n = in.nextInt();
        int f=factorial_nerecursiv(n);
        System.out.println("Factorial nerecursiv: " + f);
        int f1=factorial_recursiv(n);
        System.out.println("Factorial recursiv: " + f1);
    }
}
