
public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "  a  b c   d   e  ";
		
		//it will remove leading space means it will remove before and after the string but in between its not removing
		
		String trimmedStr= str.trim(); //
		System.out.println(trimmedStr);
		
		String Str1= str.replaceAll("\\s", ""); // will use replaceAll  is used for removing the white space between the words
		System.out.println(Str1);
		
	}

}
