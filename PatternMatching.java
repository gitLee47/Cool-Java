import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class PatternMatching {
	public static String findPattern(Hashtable<String, Integer> patternMatcher){
		Enumeration<String> keys = patternMatcher.keys();
		String key;
		String pattern = "";
		
		while(keys.hasMoreElements()){
			key = (String) keys.nextElement();
			if(patternMatcher.get(key) > 0){
				pattern += patternMatcher.get(key)+"";
			}
		}
		return pattern;
	}
	
	public static Hashtable<String, Integer> initializePatternMatcher(){
		Hashtable<String, Integer> patternMatcher = new Hashtable<String, Integer>();
		
		for(int i = 97; i <= 122; i++ ){
			patternMatcher.put(Character.toString ((char) i), 0);
		}
		
		return patternMatcher;
	}
	
	public static Hashtable<String, Integer> computePattern(Hashtable<String, Integer> patternMatcher, String s){
		char[] key;
		
		key  = s.toCharArray();
		
		for(char k : key){
			if(patternMatcher.containsKey(Character.toString(k))){
				int value = patternMatcher.get(Character.toString (k));
				patternMatcher.put(Character.toString(k), ++value);
			}
		}
		
		return patternMatcher;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> dict = new ArrayList<String>();
		dict.add("cdf");
		dict.add("too");
		dict.add("hgfdt");
		dict.add("paa");
		
		Hashtable<String, Integer> patternMatcher = initializePatternMatcher();
		
		String pattern = "caa";
		patternMatcher = computePattern(patternMatcher, pattern);
		String testPattern = findPattern(patternMatcher);
		
		patternMatcher = initializePatternMatcher();
		
		int patLen = pattern.length();
		
		for(String s : dict)
		{
			if(s.length() == patLen){
				patternMatcher = computePattern(patternMatcher, s);
				String finalPattern = findPattern(patternMatcher);
				
				if(testPattern.equalsIgnoreCase(finalPattern)){
					System.out.println(testPattern +" "+ finalPattern);
					System.out.println(s);
				}
				patternMatcher = initializePatternMatcher();
			}
		}		
	}
}
