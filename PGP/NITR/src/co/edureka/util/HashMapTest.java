package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		bank.put("Sunil",15000.0f);
		bank.put("Anil",15000.0f);
		bank.put("Naveen",15750.0f);
		System.out.println(bank.put("Rahul",35120.0f)); //null
		System.out.println(bank.put("Sunil",11500.5f)); //15000.0
		
		System.out.println(bank);
		
		float bal = bank.get("Sunil");
		System.out.println("A/C balance of Sunil = "+ bal);
		
		bal += 1500.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		
		System.out.print("A/C Holders = ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name + " | ");
		}
		System.out.println();
		System.out.println("----------------------------");
		
		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Float> entry = it.next();
			String name = entry.getKey();
			Float balance = entry.getValue();
			System.out.println(name+ " :: "+balance);
			Thread.sleep(2000);
		}
	}
}
