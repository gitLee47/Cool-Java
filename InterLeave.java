import java.util.HashMap;

public class InterLeave {
	static String inp = "AMAZON";
	static char[][] a = { {'B', 'B', 'A', 'B', 'B', 'N'},
			{'B', 'B', 'M', 'B', 'B', 'O'},
			{'B', 'B', 'A', 'B', 'B', 'Z'},
			{'N', 'O', 'Z', 'B', 'B', 'A'},
			{'B', 'B', 'B', 'B', 'B', 'M'},
			{'B', 'B', 'B', 'B', 'B', 'A'} };
	
	static HashMap<Character, Integer> hash =  new HashMap<Character, Integer>();
	static int counter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int i=0; i<a[0].length; i++){
			resetHash();
			for(int j=0; j<a[0].length; j++){
				if(hash.containsKey(a[i][j]) && hash.get(a[i][j]) > 0){
					count+=findCount(i, j);
					
					//hash.put(a[i][j], hash.get(a[i][j]) - 1);
					//a[i][j]=0;
				}
			}
		}
		
		System.out.println(count);
		
		for(int i=0; i < a[0].length; i++ ){
			for(int j=0; j < a[0].length; j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
	
	static int findCount(int i, int j){
		int found = 0;
		boolean nonZero =  false;
		for(int val : hash.values()){
			//System.out.print(val);
			if(val > 0){
				nonZero = true;
				break;
			}
		}
		//System.out.println();
		if(!nonZero && counter == inp.length()){
			//System.out.println("Hello");
			counter = 0;
			return 1;
		}
		if(i< 0 || j <0 || i>=a[0].length || j >= a[0].length){
			return found;
		}
		
		if(hash.containsKey(a[i][j]) && hash.get(a[i][j]) > 0){
			hash.put(a[i][j], hash.get(a[i][j]) - 1);
			a[i][j]=0;
			counter++;
			found+=findCount(i+1, j)+findCount(i,j+1)+findCount(i-1, j)+ findCount(i, j-1);
			
			
		}
		return found;
	}
	
	static void resetHash(){

		for(int i =0; i< inp.length(); i++){
			char val = inp.charAt(i);
			if(hash.containsKey(val)){
				hash.put(val, hash.get(val)+1);
			}
			else{
				hash.put(val,1);
			}
		}
	}
}
