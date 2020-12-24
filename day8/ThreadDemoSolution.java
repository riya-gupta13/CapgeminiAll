package day8;

import java.util.ArrayList;
import java.util.List;

import day7.Employeee;

class IncrementSalaryTask implements Runnable{

	Employeee e;
	public IncrementSalaryTask(Employeee e) {
		this.e = e;
	}

	@Override
	public void run() {
		System.out.println("incrementing salary... in thread " + Thread.currentThread().getName());
		e.incrementSalary();
		System.out.println(e);
	}
	
}

public class ThreadDemoSolution {

	public static void main(String[] args) {
		
List<Employeee> employees = new ArrayList<>();
		
		employees.add(new Employeee(12, "Ravi", 34343.34));
		employees.add(new Employeee(12, "Rahul", 34343.34));
		employees.add(new Employeee(11, "Priya", 64343.34));
		employees.add(new Employeee(2, "Arijit", 24343.34));
		employees.add(new Employeee(14, "Saranya", 74343.34));
	
		
		long startTime = System.currentTimeMillis();
		// operation on a bulk 
		
		List<Thread> threads = new ArrayList<>();
		for(Employeee e: employees) {
			Thread t = new Thread(new IncrementSalaryTask(e));
			
			// starting thread
			t.start();
			threads.add(t);

		}
		
		// wait for thread to finish and be joined
		try {
//			Thread.sleep(2500);
			for(Thread t : threads) {
				t.join();
			}
		} catch (InterruptedException ee) {
			// TODO Auto-generated catch block
			ee.printStackTrace();
		}
		// main thread
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total time taken to process: " + (endTime - startTime));
		
		
		

	}

}