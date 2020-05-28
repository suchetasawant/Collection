package LinkedList;
import java.util.*;
import java.util.LinkedList;

public class Linkedvector {
	public static void main(String[] args) {
		ArrayList al;
		Vector l=new Vector();//LinkedList Vector
		l.add("Hello");
		l.add("omkar");
		l.add("Prachi");//addLast and addFirst is not allowed
		l.add(14);
		l.add(10);
		l.add("Hello");//duplicate alloweds
		l.add(null);//null allowed
		System.out.println(l);
		
		
	}

}
