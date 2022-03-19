package Exemplu;

import java.util.Scanner;

public class Supervisor extends Thread {
	
	boolean stop=false;
	public Controller c;
	IntPlaceHandler PH=new IntPlaceHandler();
	
	Supervisor_Transition_ts_2 ts_2;
	Supervisor_Transition_ts_3 ts_3;
	Scanner in=new Scanner(System.in);
	
	public void run()
	{
		PH.AddPlace(new IntPlace("ps_i1",null));
		PH.AddPlace(new IntPlace("ps_1",0));
		PH.AddPlace(new IntPlace("ps_o1",null));
		PH.AddPlace(new IntPlace("ps_2",0));
		PH.AddPlace(new IntPlace("ps_3",null));
		PH.AddPlace(new IntPlace("ps_o2",null));
		PH.AddPlace(new IntPlace("ps_i2",null));
		
		ts_2=new Supervisor_Transition_ts_2("ts_2",PH,0);
		ts_3=new Supervisor_Transition_ts_3("ts_1",PH,0);
		
		System.out.println("Supervisor: Input ps_i1 value");
		this.PH.GetPlaceByName("ps_i1").Set(Integer.parseInt(in.nextLine()));
		while(!stop)
		{
			ts_2.TransitionGuardsMappings();
			ts_3.TransitionGuardsMappings();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void StopThread()
	{
		this.stop=true;
	}

}
