//Five properties of set
//Homogenous/Hetrogenius
//Data type safty
//Duplicate value are not allowed
// very important Array to hashtag program
package Set;
import java.util.HashSet;
import java.util.ArrayList;

public class array {
	public static void main(String[] args) {
		int[]arr={1,2,4,3,6,7,8,3,9};
		HashSet hs=new HashSet();
		for(int i=0;i<arr.lenght;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println(hs);
			for(int j=0;j<arr.lenght;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				if(count>0)
				{
					System.out.println("Duplicate:"+arr[i]);
				}
			}
		}
	}

