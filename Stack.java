import java.util.EmptyStackException;

public class Stack<T>{
	private static class Node<T> {
		T data;
		Node<T> next;
		
		public Node(T d) {
			this.data = d;
		}
	}
	
	private Node<T> top;
	
	public void push(T data) {
		Node<T> n = new Node<T>(data);
		n.next = top;
		top = n;
	}
	
	public T pop() {
		if(top ==  null)
			throw new EmptyStackException();
		T data = top.data;
		top = top.next;
		return data;
	}
	
	public T peek() {
		if(top ==  null)
			throw new EmptyStackException();
		
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}

}
