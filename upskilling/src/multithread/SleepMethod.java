package multithread;

class SleepMethod extends Thread {
		 public void run(){  
		 for(int i=1;i<10;i++){  
		    try{
		    	//int a = 10;
		    	//a = 10/0;
		    	//Thread.sleep(100);
		    	System.out.println(i);
		    	}
		    catch(Exception test)
		    	{
		    	System.out.println(test);
		    	}  
		    	  
		  	}  
		 }  
		 public static void main(String args[]){  
			 SleepMethod ak=new SleepMethod();  
			 SleepMethod vj=new SleepMethod();  
		     ak.start();  
		     vj.start();
		  
		 }  
}   