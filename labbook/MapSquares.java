package labbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Math.*;

public class MapSquares {
	public Map<Integer, Integer> getSquares(ArrayList<Integer> list){
		Map<Integer, Integer> map=new HashMap<>();
		for(Integer i:list) {
			Integer j=(int) Math.pow(i,2);
			//System.out.println(j);
			//list.add(j);
			map.put(i,j);
		}
		System.out.println(map);
		return map;
		
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
		MapSquares ms=new MapSquares();
		ms.getSquares(arr);
		
		
		
		

	}

}
