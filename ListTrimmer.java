import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListTrimmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> trimmed = Arrays.asList(" test ", " yur  ",  "will");
		
		for(ListIterator<String> iter = trimmed.listIterator(0); iter.hasNext();){
			iter.set(iter.next().trim());
			
		}
		
		System.out.println(trimmed);
		
	}

}
