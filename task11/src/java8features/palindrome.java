package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class palindrome {
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
    List<String> list1=eval(list,s->ispalindrome(s));
    list1.forEach(i->System.out.println(i));
	}
	   private static boolean ispalindrome(String s) {
		 String reversestring=new StringBuilder(s).reverse().toString();
		return s.equals(reversestring);
	}
	public static List<String> eval(List<String> list, Predicate<String> predicate) {
             List<String> str=new ArrayList<String>();
		      for(String n: list) {

		         if(predicate.test(n)) {
		              str.add(n);
		         }
		      }
		      return str;
	}
}
