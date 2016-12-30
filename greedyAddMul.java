
public class greedyAddMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 3;
		int val = 0;
		int totOper =0;
		
		if(N == 0)
			return;
		val+=1;
		totOper++;
		while(val != N){
			if(val*2 < N) {
				totOper++;
				val = val*2;
			}
			else if(val < N) {
				while(val != N) {
					val += 1;
					totOper++;
				}
				break;
			}
		}
		System.out.println(totOper);
	}

}
