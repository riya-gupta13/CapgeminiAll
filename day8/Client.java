package day8;

class MyThreads implements Runnable{
	private Display display;
	private String name;
	public void MyThreads(Display display, String name) {
		this.display=display;
		this.name=name;
	}

	public MyThreads() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		display.wish(name);
		
	}
	
}
public class Client {

	public static void main(String[] args) {
		Display display=new Display();
		for(int j=0;j<10;j++) {
		MyThreads r=new MyThreads();
		MyThreads r2=new MyThreads();
		Thread t=new Thread(r);
		t.start();
		Thread t1=new Thread(r2);
		t1.start();
		 r.MyThreads(display,"Riya");
		r2.MyThreads(display, "Riyaaaaa");
		}
	}
//so to synchronize we made the wish method synchronized 
}
