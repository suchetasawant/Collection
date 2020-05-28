import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;

public interface peek
{
	public class LinkedListDemo {
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
			System.out.println(l.pop());
			System.out.println("after pop:"+l);
			
		}
	}
}

