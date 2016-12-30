
public class ToePliz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{6, 7, 8, 9, 2},
				  {4, 6, 7, 8, 9},
				  {1, 4, 6, 7, 8},
				  {0, 1, 3, 6, 7}};
									
		System.out.println(toePliz(matrix));
	}
	
	private static boolean toePliz(int[][] arr){
		int zeroth = arr[0][0];
		for(int i=0 ; i< arr.length; i++){
			if(arr[i][i] != zeroth)
				return false;
		}
		
		return true;
	}

}
