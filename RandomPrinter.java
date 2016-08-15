import java.util.*;


public class RandomPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//random shuffling
		Collections.shuffle(Arrays.asList(args), new Random());
		
		List<String> ss =  Arrays.asList(args);
		ss.stream().forEach(e -> System.out.println(e));
		
		
		//using advanced For
		for(String s: args){
			System.out.println(s);
		}

	}

}
