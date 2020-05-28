import java.util.*;
import java.util.LinkedList;
	
	public class Pop {
		public static void main(String[] args) {
			ArrayList al;
			Stack l=new Stack();
			Object o=l.push(10);
			l.push(20);
			l.push(30);
			l.push(40);
			l.push(10);
			System.out.println("Before pop:"+l);
			System.out.println(l.pop());
			System.out.println(l.peek());
			System.out.println("After pop:"+l);
			
		}
	}

