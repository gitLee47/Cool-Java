
public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "pale";
		String s2 ="bale";
		
		int val = 0;
		int finalVal = 0;
		
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		for(char c : str1) {
			val = c - 'a';
			if((finalVal & 1 << val) == 0) {
				finalVal |= 1 << val;
			}
			else {
				finalVal &= ~(1 << val);
			}
		}
		
		for(char c : str2) {
			val = c - 'a';
			if((finalVal & 1 << val) == 0) {
				finalVal |= 1 << val;
			}
			else {
				finalVal &= ~(1 << val);
			}
		}
		
		if((finalVal & (finalVal - 1)) == 0)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
