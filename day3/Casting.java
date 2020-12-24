package day3;

public class Casting {

	public static void main(String[] args) {
		int i=23;
		double j=56;
		byte b=56;
		
		
		//Upcasting
		Object o = new String("hey");
		j=i;
		i=b;
		
		String StrObj = new String("Hello");
		Object  Obj = StrObj;

		//downcasting
		i=(int)j;
		b=(byte)i;
		b=(byte)j;
		
		if(o instanceof Casting) {
			Casting obj=(Casting)o;
			System.out.println(obj);
		}
		else {
			System.out.println("not similar types");
		}

	}

}
