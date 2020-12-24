package day8;

public class Display {
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
		System.out.print("hello ");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
		}
	}

}
