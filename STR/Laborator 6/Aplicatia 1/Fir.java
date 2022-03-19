package Aplicatia1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Lock;

public class Fir extends Thread {
	int activity_min, activity_max,activity_min1, activity_max1,t;
	Lock l1;
	Lock l2;
	CyclicBarrier bariera;
	
	public Fir(Lock l1, Lock l2, int activity_min, int activity_max,int activity_min1, int activity_max1, int t, CyclicBarrier bariera)
	{
		this.l1=l1;
		this.l2=l2;
		this.activity_min=activity_min;
		this.activity_max=activity_max;
		this.activity_min1=activity_min1;
		this.activity_max1=activity_max1;
		this.t=t;
		this.bariera = bariera;
	}
	
	public void run()
	{
		while(true) {
			 System.out.println(this.getName()+" - STATE 1");
			 int k = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
					for (int i = 0; i < k * 100000; i++) {
						i++; i--;
					}
			 this.l1.lock();
			 System.out.println(this.getName() + " - STATE 2");
			 int k1 = (int) Math.round(Math.random()*(activity_max1 - activity_min1) + activity_min1);
					for (int i = 0; i < k1 * 100000; i++) {
						i++; i--;
					}
			 if (this.l2.tryLock()) 
			 {
					 System.out.println(this.getName() + " - STATE 3");
					 this.l2.unlock();
					 this.l1.unlock();
					 try {
						Thread.sleep(t*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			 }
			 else {
				 this.l1.unlock();
				 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 this.l1.lock();
				 this.l2.lock();
				 System.out.println(this.getName() + " - STATE 3");
				 try {
						Thread.sleep(t*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 this.l1.unlock();
				 this.l2.unlock();
			 }
		    System.out.println(this.getName() + " - STATE 4"); 
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
