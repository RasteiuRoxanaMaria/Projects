package Aplicatia1;

public class Main {
	public static void main(String[] args) {
		Integer P9 =new Integer(1);
		Integer P10=new Integer(1);
		Thread fs=new ThreadS(P9, 2,4);
		Thread fm=new ThreadM(P9, P10, 3,6);
                Thread fd=new ThreadD(P9, 2,5); 
		fs.start();
		fm.start();
		fd.start();
	}
}
