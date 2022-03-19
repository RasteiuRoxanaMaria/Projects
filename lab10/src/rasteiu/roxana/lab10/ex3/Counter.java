package rasteiu.roxana.lab10.ex3;

public class Counter extends Thread {
    public int a;
    public int b;
    String n;
    Thread t;
    Counter(String name, String n, int a, int b, Thread t){
        super(name);
        this.n=n;
        this.a=a;
        this.b=b;
        this.t=t;
    }

    public void run(){
        try{
            if(t!=null) t.join();
            for(int i=a;i<=b;i++) {
                System.out.println(getName() + n + " i= " + i);

            }
            Thread.sleep(3000);
            System.out.println("Counter"+ n +" a terminat de numarat.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Counter c1=new Counter("Counter","1",0,100,null);
        Counter c2=new Counter("Counter","2",100,200,c1);

        c1.start();
        c2.start();
    }
}
