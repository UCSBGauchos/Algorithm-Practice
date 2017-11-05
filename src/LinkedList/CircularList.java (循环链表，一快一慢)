package LinkedList;

public class CircularList {
	public LinkedListNode findLoopBeginning(LinkedListNode head){
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast){
				break;
			}
		}
		
		if(fast == null || fast.next == null){
			return null;
		}
		
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
		
	}
	
	public static void main(String [] args){
		LinkedListNode head = new LinkedListNode(1);
		head = head.addToTail(head, 2);
		head = head.addToTail(head, 3);
		head = head.addToTail(head, 4);
		head = head.addToTail(head, 5);
		head = head.addToTail(head, 6);
		head = head.addToTail(head, 7);
		
		LinkedListNode begin = head.getTail(head);
		
		head = head.addToTail(head, 8);
		head = head.addToTail(head, 9);
		head = head.addToTail(head, 10);
		head = head.addToTail(head, 11);
		
		LinkedListNode end = head.getTail(head);
		
		end.next = begin;
		
		CircularList cir = new CircularList();
		LinkedListNode result = cir.findLoopBeginning(head);
		System.out.println(result.getData());
		
		
	
	}
}
