package Exemplu;


public class Main {

	public static void main(String[] args) {
		Supervisor s=new Supervisor();
		Controller c = new Controller();
		Robot r = new Robot ();
		s.c=c;
		c.s=s;
		c.r = r;
		r.c = c;
		c.start();
		r.start();
		s.start();
	}
}
