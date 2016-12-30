import java.util.EmptyStackException;

public class StackWithMin extends Stack<Integer>{
	
	Stack<Integer> s = new Stack<Integer>();
	
	public void push(int data) {
		if(s.isEmpty() || data < s.peek())
			s.push(data);
		
		super.push(data);
	}
	
	public int min() {
		return s.peek();
	}
	
	public Integer pop() {
		if(super.isEmpty())
			throw new EmptyStackException();
		if(super.peek() == s.peek())
			s.pop();
		
		return super.pop();
	}
}
