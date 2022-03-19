package Aplicatia2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;

public class FirM extends Thread {
	int activity_min, activity_max,t;
	Lock l1;
	Lock l2;
	CyclicBarrier bariera;
	
	public FirM(Lock l1, Lock l2, int activity_min, int activity_max, int t, CyclicBarrier bariera)
	{
		this.l1=l1;
		this.l2=l2;
		this.activity_min=activity_min;
		this.activity_max=activity_max;
		this.t=t;
		this.bariera = bariera;
	}
	
	public void run()
	{
		while(true) {
			System.out.println(this.getName()+" - STATE 1");
			synchronized(l1){
			synchronized(l2){	
				 System.out.println(this.getName() + " - STATE 2");
				int k = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
				for (int i = 0; i < k * 100000; i++) {
						i++; 
						i--;
				}
				try {
					Thread.sleep(t*500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			 System.out.println(this.getName() + " - STATE 3");
		}
		    activitate();
			try {
				bariera.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			activitate();
		}
	}
	
	public void activitate() {
		System.out.println(this.getName() + "> activitate");
		try {
			Thread.sleep(Math.round(Math.random() * 3 + 3) * 1000);
		} catch (InterruptedException e) {
		}
	}
}