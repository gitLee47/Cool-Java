
public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "hello";
		System.out.println(revString(inp));
	}
	
	public static String revString(String inp){
		if(inp.length() <= 1){
			return inp;
		}
		
		return revString(inp.substring(1))+ inp.charAt(0);
	}

}
