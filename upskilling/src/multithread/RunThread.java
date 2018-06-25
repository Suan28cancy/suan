package multithread;

class RunThread extends Thread{ 
	public void run(){  
	   System.out.println("Testing..!!!");  
	 }  
	public static void main(String args[]){  
		RunThread t1=new RunThread();  
	t1.run(); 
	}  
}   