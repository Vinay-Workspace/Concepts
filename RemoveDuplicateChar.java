import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbbbccceee"; // output: abce
		
		// Approach 1--using java 8
		
		StringBuilder sb1 = new StringBuilder ();
		str.chars().distinct().forEach (c -> sb1.append ((char)c));
		System.out.println(sb1);
		
		// Approach 2--using IndexOf(..)
		
		StringBuilder sb2 =new StringBuilder ();
		for (int i=0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			int idx =str.indexOf(ch ,i+1);
			if (idx == -1)
			{
				sb2.append(ch);
			}
		}
		
		System.out.println(sb2);
		
		// Approach 3--using Character Array
		
		char[] arr = str.toCharArray();
		StringBuilder sb3 = new StringBuilder ();
		for (int i =0 ;i < arr.length ; i++)
		{
		boolean repated  = false ;
		
		for(int j= i+1 ; j< arr.length ; j++)
		{
			if (arr[i] ==arr[j])
			{
				repated = true ;
				break;
			}
		}
		if ( !repated)
		{
			sb3.append(arr[i]);
		}
		}
		System.out.println(sb3);
		
		
		// Approach 1--using Set Interface Method
		
		
		StringBuilder sb4 = new StringBuilder ();
		Set <Character> set = new LinkedHashSet();
		for (int i = 0 ; i< str.length(); i++)
		{
			set.add(str.charAt(i));	
		}
		for (Character c : set)
		{
			sb4.append(c);
		}
		System.out.println(sb4);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
