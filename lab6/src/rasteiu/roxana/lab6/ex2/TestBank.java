package rasteiu.roxana.lab6.ex2;

public class TestBank {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.addAcount("Roxana",145.89);
        b.addAcount("Maria",1234.67);
        b.addAcount("Ioana",646.90);
        b.addAcount("Gabriela",324.90);
        System.out.println("All accounts with the ballance between 100 and 600");
        b.printAccounts(100,600);
        System.out.println("The sorted list by balance");
        b.printAcounts();

        System.out.println("The sorted list by name");
        b.getAllAcounts();

        System.out.println(b.getAccount("Roxana"));

    }
}

