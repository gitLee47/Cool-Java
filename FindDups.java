import java.util.*;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> distinct = new TreeSet<String>(new compareArgs());
		
		SortedSet<String> dups = new TreeSet<String>(new compareArgs());
		
		for(String s: args){
			if(!distinct.add(s))
				dups.add(s);
		}
		System.out.println(distinct);
		System.out.println(dups);
		
	}
	
	public static class compareArgs implements Comparator<String>{
		
		public int compare(String i, String j){
			return i.compareToIgnoreCase(j);
			
		}
	}

}
