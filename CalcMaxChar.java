
public class CalcMaxChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "HO HELLO!";
		inp = inp.toLowerCase().trim();
		int[] hashArr = new int[26];
		int maxIndex = 0;
		int maxCount = 0;
		for(int i=0; i< inp.length(); i++){
			if(inp.charAt(i) >= 'a' && inp.charAt(i) <= 'z') {
				int idx = inp.charAt(i)- 'a';
				hashArr[idx]++;
				if(hashArr[idx] > maxCount){
					maxIndex = i;
					maxCount = hashArr[idx];
				}
			}
		}
		
		System.out.println(inp.charAt(maxIndex));
	}

}
