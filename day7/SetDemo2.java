package day7;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		
		// Hashing -- any implementation classes with Hash
		// must implement the hashcode();
		Set<Fruit> fruits = new HashSet<>();
		
		fruits.add(new Fruit("apple"));
		
		// Hashcode is going to be the same for "oranges" -- go in the same bucket
		fruits.add(new Fruit("orange"));
		fruits.add(new Fruit("orange"));
		fruits.add(new Fruit("pineapple"));
		
		// Equals & Hashcode contract
//		 If two objects are equal, the must produce the same hashcode
//		If two objects are not equal, they can still have the same hashcode.. not necessary though
		
		
		System.out.println(fruits.contains(new Fruit("apple")));

	}

}