package LinkedList;

public class FindElement {
	public int findNthLast(LinkedListNode head, int nth){
		if(head == null){
			return 0;
		}
		
		int i = findNthLast(head.next, nth)+1;
		if(i == nth){
			System.out.println("Find the result");
			System.out.println(head.getData());
		}
		
		return i;
	}
	public static void main(String [] args){
		FindElement find = new FindElement();
		LinkedListNode head = new LinkedListNode(1);
		head = head.addToTail(head, 2);
		head = head.addToTail(head, 3);
		
		find.findNthLast(head,3);
	}
}
