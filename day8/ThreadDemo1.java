package day8;

class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("thread Running:" +Thread.currentThread().getName());
		
	}
	
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Thread t=new Thread(new MyThread());
			t.start();	
		}
		
		

	}

}



