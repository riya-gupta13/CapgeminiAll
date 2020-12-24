package day8;

class TestRunnables implements Runnable{
        int j=0;
        //we can use synchronized method
     /*   public synchronized void increments() {
        	j++;
        	System.out.println("running:" + Thread.currentThread().getName());
        	System.out.println(j);
        	
        }*/
     //or we can use synchronized block 
	@Override
	public void run() {
		  synchronized(this){
	        	j++;
	        	System.out.println("running:" + Thread.currentThread().getName());
	        	System.out.println(j);
	        		
	        }
		//increments();
		
	}
	
}
public class TestThread {
	public static void main(String[] args) {
		TestRunnables r=new TestRunnables();
		
		for(int i=0;i<20000;i++) {
			Thread t=new Thread(r);
			t.start();
			
		}
		
	}
	
	
	

}
