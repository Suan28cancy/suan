package multithread;

class ExtendThread extends Thread{
public void run(){  
System.out.println("Hello Suganya...!!!");  
}  
	public static void main(String args[]){  
	ExtendThread t1=new ExtendThread();  
	t1.start();  
	}  
} 