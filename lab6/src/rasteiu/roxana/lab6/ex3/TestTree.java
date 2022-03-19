package rasteiu.roxana.lab6.ex3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args){
        Bank b=new Bank();
        b.addAcount("Roxana",102.10);
        b.addAcount("Maria",234.45);
        b.addAcount("Ioana",908.67);
        System.out.println("All accounts");
        b.printAcounts();
        System.out.println();
        b.printAccounts(100,200);
    }
}
