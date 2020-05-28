//hashSet(c)= Duplicate is not allowed
//backend data structure hashtable
//null insertion is allowed
//constant performance
package Set;
import java.util.*;
import java.util.LinkedList;
import java.util.HashSet;

public class hash {
		public static void main(String[] args) {
			HashSet hs=new HashSet();
			hs.add(10);
			hs.add(20);
			hs.add(50);
			hs.add(30);
			hs.add("Hello");//HashSet is not allowed First and Last value 
			hs.add(10);//Hashset is not allowed duplicate value
			System.out.println(hs);
			
		}
		

	}

