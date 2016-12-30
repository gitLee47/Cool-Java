
public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr = "abcbd";
		char[] test = testStr.toCharArray();
		
		boolean[] stringSet = new boolean[26];
		
		/*for(int i = 0 ; i < test.length ; i++) {
			if(stringSet[test[i] - 97]){
				System.out.println("not unique");
				return;
			}
			stringSet[test[i] - 97] = true;
		}
		System.out.println("Unique!");*/
		
		//bit vector method
		int checker = 0;
		
		for(int i = 0 ; i < test.length ; i++) {
			int val = test[i] - 'a';
				if((checker & (1 << val)) > 0) {
					System.out.println("Not Unique");
					return;
				}
			checker |= (1 << val);
		}
		System.out.println("Unique!");
		
	}

}
