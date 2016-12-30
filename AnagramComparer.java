
public class AnagramComparer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "anazzgram";
		String str2 = "znagaramz";
				
		System.out.println(AnagramTest(str1,str2));
	}
	
	public static boolean AnagramTest(String str1, String str2) {
		int val1 = 0;
		int val2 = 0;
		
		int finalVal = 0;
		int finalVal2 = 0;
		
		if(str1.length() != str2.length())
			return false;
		
		for(int i=0; i < str1.length(); i++) {
			val1 = str1.charAt(i) - 'a';
			val2 = str2.charAt(i) - 'a';
			
			val1 |= 1 << val1;
			val2 |= 1 << val2;
			
			finalVal |= val1;
			finalVal2 |= val2;
		}
		
		if(finalVal == finalVal2)
			return true;
		
		return false;
	}

}
