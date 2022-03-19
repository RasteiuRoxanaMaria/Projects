package Aplicatia1;

public class ThreadS extends Thread {
	Integer P9;
	int activity_min, activity_max;
	
	public ThreadS(Integer P9, int activity_min, int activity_max) {
		this.P9=P9;
		this.activity_min=activity_min;
		this.activity_max=activity_max;
	}
	
	public void run() {
		System.out.println("P1");
		synchronized(P9){
			System.out.println("P4");
			int k = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
			for (int i = 0; i < k * 100000; i++) {
					i++; 
					i--;
			}
			int t4=4;
			try {
				Thread.sleep(t4*500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("P6");
	}

}
