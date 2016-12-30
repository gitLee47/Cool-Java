
public class Node {
	int data;
	Node next = null;
	
	Node(int data) {
		this.data = data;
	}
	
	public void append(Node n) {
		
		Node n1 = this;
		
		while(n1.next != null) {
			n1 = n1.next;
		}
		
		n1.next = n;
	}

	public Node printKToEnd(int k) {
		
		Node p1 = this;
		Node p2 = this;
		
		int i=1;
		while(i != k && p1.next != null) {
			p1 = p1.next;
			i++;
		}
		
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}
}
