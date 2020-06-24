package java8features;
import java.util.stream.*;
import java.util.*;
public class average
{
	static int n;
	static Double res;
	public static void main(String[] args)
	{
	System.out.println("Enter the no of integer");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
   Integer a[]=new Integer[n];
   for(int i=0;i<n;i++)
   {
	   a[i]=sc.nextInt();
   }
   List<Integer> list= Arrays.asList(a);
       res=average(list);
       System.out.println(res);
	}
	private static Double average(List<Integer> list) {
		
		return list.stream().mapToInt(i->i).average().getAsDouble();
	}
	}
