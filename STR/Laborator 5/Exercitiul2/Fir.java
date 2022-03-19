package Exercitiu2;

import java.util.concurrent.Semaphore;

public class Fir extends Thread {
	Semaphore s;
	int nume, intarziere, k, permise;
	public Fir(int n, Semaphore sa, int intarziere, int k, int permise) {
		this.nume = n;
		this.s = sa;
		this.intarziere = intarziere;
		this.k = k;
		this.permise = permise;
	}
	public void run() {
		while(true) {
			System.out.println(this.getName()+" - STATE 1");
			try {
				this.s.acquire(this.permise); 
				System.out.println("Fir " + nume + " a luat un jeton din semafor");
				System.out.println(this.getName()+" - STATE 2");
				for (int i = 0; i < k * 100000; i++) {
					i++;
					i--;
				}
				this.s.release(); 
				System.out.println("Fir " + nume + " a eliberat un jeton din semafor");
				System.out.println(this.getName()+" - STATE 3");
				Thread.sleep(this.intarziere*500);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		  System.out.println(this.getName()+" - STATE 4");
		}
	}
}
