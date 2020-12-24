package day9;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExistingFuncInterfacesDemo {

	public static void main(String[] args) {
		
		Predicate<String> predicate = (str) -> str.isEmpty();
		System.out.println(predicate.test("ksd"));
		

		Function<String, String> lamda = (s) -> s.substring(2);
		System.out.println(lamda.apply("test"));
		
		BiFunction<String, String, Boolean> bifunction = (s1, s2) -> s1.equals(s2);
		System.out.println(bifunction.apply("test" , "test"));
		
		BiFunction<Double, Double, Double> bifunct = (x, y) -> Math.pow(x, y);
		System.out.println(bifunct.apply(2.0 , 3.0));
		
		
		Consumer<String> consumer = (s)-> System.out.println(s);;
		

	}

}