
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Approach 1--Using toCharArray() Method
		  String str = "Marvellous";
		  	char[] chArr = str.toCharArray();
		  	for (int i=chArr.length -1; i>=0; i--)
		  	{
		  		System.out.print(chArr[i]);  // it will print in vertical line  need to remove ln from println 		
		
		  	}
		  	
		  	System.out.println(); //Break line
		
		// Approach 2-- Using charAt(int index) method
		for (int i =str.length()-1 ;i>=0 ;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println(); //Break line
		
		// Approach 3-- Using java.lang.StringBufferclass provided reverse () method
		
		StringBuffer sb = new StringBuffer (str);
		System.out.println(sb.reverse());
		
		
		// Approach 4-- Using java.lang.StringBuilderclass provided reverse () method
		
		StringBuilder sbuilder = new StringBuilder (str);
		System.out.println (sbuilder.reverse());
	}

}
