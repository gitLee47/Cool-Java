
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Tact Moa";
		s1 = s1.toLowerCase();
		
		char[] str = s1.toCharArray();
		
		int val = 0;
		int finalVal = 0;
		
		for(char c : str) {
			if(c == 32)
				continue;
			val = c - 'a';
			System.out.println(c);
			if((finalVal & 1 << val) == 0) {
				finalVal |= 1 << val;
			}
			else {
				finalVal &= ~(1 << val);
			}
		}
		
		
		
		if(finalVal == 0 || (finalVal & (finalVal - 1)) == 0)
			System.out.println("Permutation");
		else
			System.out.println("Not Permutation");

	}

}
