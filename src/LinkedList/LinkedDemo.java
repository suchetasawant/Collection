package LinkedList;
import java.util.LinkedList;

public class LinkedDemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();//LinkedList 
		l.add("Hi");
		l.add("Hello");
		l.add(10);
		l.add(false);
		l.add(10);//duplicate value allowed
		l.addFirst(20);//First allowed
		l.addLast(30);//last allowed 
		System.out.println(l);
	}

}