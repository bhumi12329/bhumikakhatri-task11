package java8features;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class string 
{
	
	
	public static void main(String[] args)
	{
     List<String> list=new ArrayList<String>();
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no of string");
     n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
    	 String str=sc.next();
    	 list.add(str);
     }
     List<String> list1=stringlist(list);
     list1.forEach(s->System.out.println(s));
     }

	private static List<String> stringlist(List<String> list) {
		return list.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
	}
     
}
