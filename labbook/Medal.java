package labbook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Medal {
	String type;
	public HashMap<String, Integer> getStudents(HashMap<String, Integer> map){
		Set<String> keySet= map.keySet();
		for(String key:keySet) {
			//System.out.println("keys:" +key);
			if(map.get(key)>=90) {
				type="Gold";
				System.out.println(type);
			}
			else if(map.get(key)>=80 && map.get(key)<90) {
				type="Silver";
				System.out.println(type);
			}
			else if(map.get(key)>=70 && map.get(key)<80) {
				type="Bronze";
				System.out.println(type);
			}
		}
		return map;	
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map= new HashMap<>(); 
		map.put("123", 85);
		map.put("234", 90);
		map.put("456", 94);
		map.put("789", 76);
		Medal m=new Medal();
		m.getStudents(map);
		//can be done done instead of using set
		/*List<Integer> li=(List<Integer>) map.values();
		System.out.println(li);*/
	}

}
