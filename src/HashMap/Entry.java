package Entry;
import java.util.*;
public class Entry {
	private static final Object Null=null;
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("jan");
		al.add("Feb");
		al.add("March");
		HashMap hm=new HashMap();
		for(int i=0;i<al.size();i++)
		{
			Object o=al.get(i);
			hm.put(i, 0);
			
		}
		System.out.println(hm);
		Set s=hm.keySet();
		for(Object k:s)
		{
			System.out.println(hm.get(k));
		}
		
	}

}
