package day10;

public class Car extends Vehicles {
	//String type;

	public Car() {
		super();
		//this.type = type;
	}

	public Car(String model_no, String model_name, String owner_name, String owner_details) {
		super(model_no, model_name, owner_name, owner_details);
		
	}
	public void set_type(String type) {
		this.type = type;
	}

	public String get_type() {
		return type;
	}

	
	@Override
	public String retrieve(){
		try {
		if(type.equals("null")) {
			throw new TypeException();
		}
		}
		catch(TypeException e) {
			return "[model_no=" + model_no + ", model_name=" + model_name + ", owner_name=" 
					+ owner_name + ", owner_details=" + owner_details + "]";
			//System.out.println("handled" +get_type());
		}
		return new TypeException().toString();
		
	}
	

}
