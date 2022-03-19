package Aplicatia2;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) {
		CyclicBarrier bariera = new CyclicBarrier(3, new Runnable() {
			public void run() {
				System.out.println("Rutina barierei");
			}
		});
		Lock l1= new ReentrantLock();
		Lock l2= new ReentrantLock();
		Thread fm=new FirM(l1,l2,3,6,3,bariera);
		Thread fd=new FirSD(l1,3,6,3,bariera);
		Thread fs=new FirSD(l1,3,6,3,bariera);
		fm.start();
		fd.start();
		fs.start();
	}

}
