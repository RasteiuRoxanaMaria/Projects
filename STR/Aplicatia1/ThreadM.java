package Aplicatia1;

public class ThreadM extends Thread{
	Integer P9;
	Integer P10;
	int activity_min, activity_max;
	
	public ThreadM(Integer P9, Integer P10, int activity_min, int activity_max) {
		this.P9=P9;
		this.P10=P10;
		this.activity_min=activity_min;
		this.activity_max=activity_max;
	}
	
	public void run() {
		System.out.println("P11");
		synchronized(P9){
		synchronized(P10){	
			System.out.println("P12");
			int k = (int) Math.round(Math.random()*(activity_max - activity_min) + activity_min);
			for (int i = 0; i < k * 100000; i++) {
					i++; 
					i--;
			}
			int t12=3;
			try {
				Thread.sleep(t12*500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("P13");
	}
	}

}
