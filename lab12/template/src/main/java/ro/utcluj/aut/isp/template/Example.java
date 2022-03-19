package ro.utcluj.aut.isp.template;



import java.util.logging.Logger;

/**
 * @author mihai.hulea
 */
public class Example {

    public static int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("It works!");
        System.out.println("Number of arguments received: "+args.length+" ");
        for(String arg:args)
            System.out.println("Argument: "+arg);
        System.out.printf("Result of adding %d with %d is: %d\n\n",10,23,Example.add(10,23));
    }
}
