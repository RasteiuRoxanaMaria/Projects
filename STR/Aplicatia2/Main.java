package Aplicatia2;

public class Main {
	public static void main(String[] args) {
		Integer P9=new Integer(1);
		Integer P10=new Integer(1);
		Thread fs=new ThreadS(P9, P10);
		Thread fd=new ThreadD(P9, 10);
		fs.start();
		fd.start();
	}
}
