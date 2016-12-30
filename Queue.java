import java.util.EmptyStackException;

public class Queue<T> {
	private static class Node<T> {
		T data;
		Node<T> next;
		
		public Node(T d) {
			this.data = d;
		}
	}
	
	private Node<T> head = null;
	private Node<T> tail = null;
	
	public void add(T data) {
		Node<T> n = new Node<T>(data);
		
		if(this.isEmpty()) {
			head = n;
			tail = n;
		}
		else {
			tail.next = n;
			tail = n;
		}
		
	}
	
	public T remove() {
		if(head == null)
			throw new EmptyStackException();
		
		T d = head.data;
		head = head.next;
		
		return d;
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}

}
