import java.util.Stack;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		n1.append(new Node(2));
		n1.append(new Node(2));
		n1.append(new Node(1));
		
		
		Node fast = n1;
		Node slow = n1;
		
		Stack<Node> tester = new Stack<Node>();
		
		while(fast != null && fast.next != null) {
			
			tester.push(slow);
			
			fast = fast.next.next;
			slow = slow.next;
			
		}
		
		if(fast != null) {
			slow = slow.next;
		}
		int top = 0;
		while(slow != null){
			top = tester.pop().data;
			
			if(slow.data != top )
				return;
			
			slow = slow.next;
		}
		
		System.out.println("palindrome!!");

	}

}
