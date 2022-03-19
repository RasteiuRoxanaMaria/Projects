package Aplicatia1;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) {
		CyclicBarrier bariera = new CyclicBarrier(2, new Runnable() {
			public void run() {
				System.out.println("Rutina barierei");
			}
		});
		Lock l1= new ReentrantLock();
		Lock l2= new ReentrantLock();
		Thread fd=new Fir(l1,l2,3,5,5,7,5,bariera);
		Thread fs=new Fir(l2,l1,2,4,4,6,4,bariera);
		fd.start();
		fs.start();
	}

}
