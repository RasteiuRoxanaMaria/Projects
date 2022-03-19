package Aplicatia2;

public class ThreadS extends Thread {
	Integer P9, P10;
	public ThreadS(Integer P9, Integer P10) {
		this.P9=P9;
		this.P10=P10;
	}
	public void run() {
		System.out.println("P1");
		int activity_min=2;
		int activity_max=4;
		int p1 = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
		for (int i = 0; i < p1 * 100000; i++) {
				i++; 
				i--;
		}
		synchronized(P9) {
			System.out.println("P4");
			int activity_min1=4;
			int activity_max1=6;
			int p4 = (int) Math.round(Math.random()*(activity_max1 - activity_min1) + activity_min1);
			for (int i = 0; i < p4 * 100000; i++) {
					i++; 
					i--;
			}
			synchronized(P10) {
				int t6=4;
				try {
					Thread.sleep(t6*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          }
			System.out.println("P6");
		}
		System.out.println("P7");
	}
}
