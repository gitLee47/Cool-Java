
public class CStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd0";
		char[] strChar = str.toCharArray();
		int len = str.length()-1;
		
		for(int i=0; i < (str.length()-1)/2 ; i++) {
			reverse(strChar, i, --len);
			
		}
		
		System.out.println(String.copyValueOf(strChar));
		
		}

	private static void reverse(char[] strChar, int i, int len) {
		char temp = strChar[i];
		strChar[i] = strChar[len];
		strChar[len] = temp;
	}

}
