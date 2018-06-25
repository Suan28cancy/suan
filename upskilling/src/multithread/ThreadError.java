package multithread;

public class ThreadError extends Thread {
	public void run(){  
	System.out.println("Test...");  
	}  
	public static void main(String args[]){  
	ThreadError ak=new ThreadError();  
	ak.start();  
	ak.start();  
	}  
}  