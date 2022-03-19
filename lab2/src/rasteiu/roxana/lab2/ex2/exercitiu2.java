package rasteiu.roxana.lab2.ex2;
import java.util.*;
public class exercitiu2 {
    static void nestedif(){
        String denumire_numar;
        Scanner in = new Scanner (System.in);
        int numar = in.nextInt();
        if (numar == 1)
        {
            denumire_numar = " ONE " ;
        }
        else
        if (numar == 2)
        {
            denumire_numar = " TWO " ;
        }
        else
        if (numar == 3)
        {
            denumire_numar = " THREE " ;
        }
        else
        if (numar == 4)
        {
            denumire_numar = " FOUR " ;
        }
        else
        if (numar == 5)
        {
            denumire_numar = " FIVE " ;
        }
        else
        if (numar == 6)
        {
            denumire_numar = " SIX " ;
        }
        else
        if (numar == 7)
        {
            denumire_numar = " SEVEN " ;
        }
        else
        if (numar == 8)
        {
            denumire_numar = " EIGHT " ;
        }
        else
        if (numar == 9)
        {
            denumire_numar = " NINE " ;
        }
        else
        {
            denumire_numar = " Valoare invalida ";
        }
        System.out.println(denumire_numar);
    }

    static void switchcase(){
        String denumire_numar;
        Scanner in = new Scanner (System.in);
        int numar = in.nextInt();
        switch (numar){
            case 1: denumire_numar = " ONE " ;
                break;
            case 2: denumire_numar = " TWO " ;
                break;
            case 3: denumire_numar = " THREE " ;
                break;
            case 4: denumire_numar = " FOUR " ;
                break;
            case 5: denumire_numar = " FIVE " ;
                break;
            case 6: denumire_numar = " SIX " ;
                break;
            case 7: denumire_numar = " SEVEN " ;
                break;
            case 8: denumire_numar = " EIGHT " ;
                break;
            case 9: denumire_numar = " NINE " ;
                break;
            default: denumire_numar = "Valoare invalida"; break;
        }
        System.out.println(denumire_numar);
    }

    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        if (a == 1)
        {
            nestedif();
        }
        else
        {
            switchcase();
        }
    }
}
