
public class gcdLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nume = {4,2,2,2};
		int[] deno = {2,4,4,3};
		
		int numeSum = 0;
		
		int LCM = lcm(deno);
		
		for(int i=0; i< nume.length; i++) {
			numeSum +=  nume[i]* (LCM/deno[i]);
		}
		
		System.out.println(numeSum);
		
		int GCD = gcd(numeSum, LCM);
		
		System.out.println("Reduced fraction = "+ numeSum/GCD + "/"+ LCM/GCD);

	}
	private static int lcm(int a, int b)
	{
	    return a * (b / gcd(a, b));
	}

	private static int lcm(int[] input)
	{
	    int result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}
	
	private static int gcd(int a, int b)
	{
	    while (b > 0)
	    {
	        int temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}

}
