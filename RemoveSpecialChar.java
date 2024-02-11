public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String str = "$%%G@#I67v%e*n";
		
		String plainStr= str.replaceAll("[^a-zA-Z]", ""); // anything other then that will removed (^a-zA-Z0-9)
		System.out.println(plainStr);
		
		
	}

}
