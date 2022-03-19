package rasteiu.roxana.lab2.ex1;
import java.util.*;
public class exercitiu1 {
    static void maximxy(){
        Scanner in = new Scanner(System.in);
        System.out.print("x= ");
        int x = in.nextInt();
        System.out.print("y= ");
        int y = in.nextInt();
        System.out.println("Maximul dintre " + x + " si " + y + " este: " );
        if ( x > y )
        {
            System.out.println(x);
        } else
        {
            System.out.println(y);
        }
    }


    public static void main(String[] args) {
        maximxy();
    }
}
