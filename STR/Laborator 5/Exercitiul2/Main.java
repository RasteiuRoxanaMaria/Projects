package Exercitiu2;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		Semaphore s=new Semaphore(2);
		Fir f1, f2,f3;
		f1 = new Fir(1, s, 5, (int) Math.round(Math.random() * 3 + 3), 1);
		f2 = new Fir(2, s, 3, (int) Math.round(Math.random() * 3 + 4), 1);
		f3 = new Fir(3, s, 6, (int) Math.round(Math.random() * 2 + 5), 1);
		f1.start();
		f2.start();
		f3.start();
	}

}
