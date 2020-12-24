package day6;

public class AgeException {
	
	public static void ageInput(int age) {
		
			try{
				if(age<=15) {
				System.out.println("Age should be above 15");
			}
			}
			catch(Exception e){
				System.out.println("your age " +age);
				
			}
		}

	
	/*if(age<15) {
		throw new Exception("should be above 15");
		//throw new RuntimeException("should be above 15");
	}
	}*/

	public static void main(String[] args) {
		/*try {
			ageInput(13);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("handled");
		}*/
		ageInput(13);
		System.out.println("executed");
		
		

	}

}
