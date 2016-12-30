
public class LinkedList {

	public static void main(String[] args) {
		Node ll = new Node(0);
		ll.append(new Node(1));
		ll.append(new Node(2));
		ll.append(new Node(3));
		ll.append(new Node(4));
		
		//Node head = ll;
		
		
		
		Node number1 = new Node(7);
		number1.append(new Node(1));
		number1.append(new Node(6));
		
		Node number2 = new Node(5);
		number2.append(new Node(9));
		number2.append(new Node(2));
		
		int sum = 0;
		int rem = 0;
		int carry = 0;
		Node sumNode = null;
		
		boolean first = false;
		
		while(number1 != null) {
			sum = number1.data + number2.data + carry;
			rem = sum % 10;
			carry = sum/10;
			
			if(!first) {
				sumNode = new Node(rem);
				first = true;
			}
			else {
				sumNode.append(new Node(rem));
			}
			
			number1 = number1.next;
			number2 = number2.next;
		}
		
		while(sumNode != null) {
			System.out.println(sumNode.data);
			sumNode = sumNode.next;
		}
		
		

	}

}
