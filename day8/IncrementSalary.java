package day8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MySalary implements Callable<Double>{
	int increment;
	static double salary = 0;
	public MySalary(double salary, int increment) {
		super();
		this.increment=increment;
		MySalary.salary=salary; 
	}

	@Override
	public Double call() throws Exception {
		Thread.sleep(2000);
		
		//increment++; 
		salary+=increment; 
		return salary;
	}
	
}
public class IncrementSalary {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(int i=1;i<10;i++) {
			Callable<Double> sal=new MySalary(2000,4);
			Future<Double> future=service.submit(sal);
			System.out.println(future.get());
			
		}

	}

}
