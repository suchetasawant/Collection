package Tree;
import java.util.*;
import java.util.TreeSet;
public class Tree {
	public static void main(String[] args) {
		String s="Akash";
		String s1="Omkar";
		String s2="Suraj";
		String s3="Raaj";
		
		/*student Akash=new student(s,70,34f,4.2f);
		student Omkar=new student(s1,65,7f,5.2f);
		student Suraj=new student(s2,58,23f,3.8f);
		student Raaj=new student(s3,92,8f,3.7f);*/
		
		TreeSet ts=new TreeSet();
		ts.add(s);
		ts.add(s1);
		ts.add(s3);
		ts.add(10);
		System.out.println(ts);
	}
}

