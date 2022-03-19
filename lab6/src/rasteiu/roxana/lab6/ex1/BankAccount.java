package rasteiu.roxana.lab6.ex1;

public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(){

    }
    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }
    public void withdraw(double amount){
        this.balance=this.balance-amount;
    }
    public void deposit(double amount){
        this.balance=this.balance+amount;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BankAccount){
            BankAccount p = (BankAccount) obj;
            return balance == p.balance;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return owner.hashCode();
    }

}
