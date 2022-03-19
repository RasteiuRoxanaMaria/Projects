package Exercitiu1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) {
		Lock l1= new ReentrantLock();
		Lock l2= new ReentrantLock();
		Thread fd=new Fir(l1,l2,3,5,5,7,5);
		Thread fs=new Fir(l2,l1,2,4,4,6,4);
		fd.start();
		fs.start();

	}

}
