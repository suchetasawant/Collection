import java.util.*;
import java.util.HashSet;
import java.util.Map;
public class Entry {
	
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1,"Jan");//Entry 1
		hm.put(2,"Feb");//Entry 2
		hm.put(3,"March");
		hm.put(4,"April");
		hm.put(5,"May");
		//Iterating using entry//
		Set<Map.Entry>entries=hm.entrySet();
		System.out.println("Intrating using entry Interface");
		for(Map.Entry entry:entries)
		{
			System.out.println(entry.getkey());
		}
	}
}
		

