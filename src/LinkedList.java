//push program//
import java.util.*;
import java.util.ArrayList;

public class LinkedList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Stack l=new Stack();
		Object o=l.push(10);
		l.push(20);
		l.push(30);
		l.push(40);
		l.push(10);//duplicate value allowed
		System.out.println(l);
		
	}
	
	

}
