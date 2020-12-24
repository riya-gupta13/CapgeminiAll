package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BankMap {
	public static float findInterest(Map<String, Bank> banks, String bankName) {
		Bank bank=banks.get(bankName);
		return bank.interest;
	}

	public static void main(String[] args) {
		Bank b1=new Bank("Chandigarh",5.6F,"ICICI");
		Bank b2=new Bank("Delhi",5.8F,"SBI");
		Bank b3=new Bank("Ludhiana",4.1F,"HDFC");
		Bank b4=new Bank("Rajasthan",3.6F,"AXIS");
		
		Branch branch1 = new Branch(234, "gk", true);
		Branch branch2 = new Branch(234, "marthalli", false);
		Branch branch3 = new Branch(4, "tnagar", true);
		
		Map<String, Bank> banks=new TreeMap<>();
		
		List<Branch> branches = new ArrayList<>();
		branches.add(branch1); 
		branches.add(branch2); 
		branches.add(branch3);
		
		// create a bank object and set branches
		Bank b5 = new Bank("Bangalore",3.9F,"AXIS");
		b5.setBranches(branches);
		//System.out.println(branches);
		banks.put("ICICI", b1);
		banks.put("SBI", b2);
		banks.put("HDFC", b3);
		banks.put("kotak", b4);
		banks.put("AXIS", b5);
		System.out.println(banks);
		Set<String> keySet=banks.keySet();
		System.out.println(keySet);
		for(String key:keySet) {
			System.out.println(banks.get(key));
		}
		System.out.println(banks.get("AXIS"));
		System.out.println(banks.values());
		System.out.println(findInterest(banks,"ICICI"));
		
		}

	}


