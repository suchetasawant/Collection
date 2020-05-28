//Vector//
import java.util.LinkedList;

import java.util.Vector;

public class sortedset {
	public static void main(String[] args) {
		Vector<Integer>v=new Vector();
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10);
		v.add(11);
		v.add(12);
		for(Integer object:v)
		{
			System.out.println(object);
			if(object%2==0)
				v.remove(object);
		}
	System.out.println(v);
	}
	
		
		
		
		
		
		
		
		
		
	}
	

}
