package Tree;
imoprt java.util.*;
import java.util.TreeSet;


public class Marks {
	public int Compare (Object o1,o2)
	{
		Student S1=(Student)o1;
		Student S2=(Student)o2;
		if(S1.Marks<S2.Marks)
		{
			return-1;
		}
		else
		if(S1.Marks>S2.Marks)
		{
			return 1;
			}
	else
	{
		return 0;
	}
	}

