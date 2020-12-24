package day8;

public class TestProdCons {

	public static void main(String[] args) throws InterruptedException {
		ProdCons p=new ProdCons();
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					p.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		Thread t2= new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					p.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		t.start();
		t2.start();
		
		t.join();
		t2.join();
	}
	
	

}
