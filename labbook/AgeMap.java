package labbook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgeMap {
	public ArrayList<Integer> votersList (Map<Integer, Integer> map){
		ArrayList<Integer> list=new ArrayList<>();
		Set<Integer> keySet= map.keySet();
		for(Integer key:keySet){
			if(map.get(key)>18) {
				//System.out.println("Eligible to vote" +map.get(key));
				list.add(key);
				//System.out.println(list);
			}
			else {
				System.out.println("Not Eligible to vote " +map.get(key));
		
			}
		}
		System.out.println(list);
		return list;
		
	}

	public static void main(String[] args) {
		Map<Integer, Integer> map=new HashMap<>();
		map.put(1,17);
		map.put(2,18);
		map.put(3,13);
		map.put(4,20);
		map.put(5,21);
		AgeMap am=new AgeMap();
		am.votersList(map);

	}

}
