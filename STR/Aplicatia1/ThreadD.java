package Aplicatia1;

public class ThreadD extends Thread {
	Integer P10;
	int activity_min, activity_max;
	
	public ThreadD(Integer P10, int activity_min, int activity_max) {
		this.P10=P10;
		this.activity_min=activity_min;
		this.activity_max=activity_max;
	}
	
	public void run() {
		System.out.println("P2");
		synchronized(P10){
			System.out.println("P3");
			int k = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
			for (int i = 0; i < k * 100000; i++) {
					i++; 
					i--;
			}
			int t5=5;
			try {
				Thread.sleep(t5*500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("P5");
	}

}
