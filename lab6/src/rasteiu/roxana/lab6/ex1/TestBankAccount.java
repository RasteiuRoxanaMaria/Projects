package rasteiu.roxana.lab6.ex1;

public class TestBankAccount {
    public static void main(String [] args){
        BankAccount b1=new BankAccount("owner1",51.00);
        BankAccount b2=new BankAccount("owner1",51.00);
        BankAccount b3=new BankAccount("owner3",56.90);
        if(b1.equals(b3)){
            System.out.println(b1+ " and " + b3 + " are equals");
        }
        else
        {
            System.out.println(b1+ " and "+ b3 + " are not equals");
        }
        if(b1.hashCode()==b2.hashCode()){
            System.out.println("b1 and b2 are equals");
        }
        else
        {
            System.out.println("b1 and b2 are not equals");
        }

    }
}
