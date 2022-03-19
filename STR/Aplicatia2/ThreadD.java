package Aplicatia2;

public class ThreadD extends Thread {
		Integer P9, P10;
		public ThreadD(Integer P9, Integer P10) {
			this.P9=P9;
			this.P10=P10;
		}
		public void run() {
			System.out.println("P2");
			int activity_min=3;
			int activity_max=5;
			int p2 = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
			for (int i = 0; i < p2 * 100000; i++) {
					i++; 
					i--;
			}
			synchronized(P10) {
				try {
					P10.wait(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("P3");
				int activity_min1=5;
				int activity_max1=7;
				int p3 = (int) Math.round(Math.random()*(activity_max1 - activity_min1) + activity_min1);
				for (int i = 0; i < p3 * 100000; i++) {
						i++; 
						i--;
				}
				synchronized(P9) {
					int t7=5;
					try {
						Thread.sleep(t7*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		          }
				System.out.println("P5");
			}
			System.out.println("P8");
		}
}
