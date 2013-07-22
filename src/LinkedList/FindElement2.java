package LinkedList;

public class FindElement2 {
	public void findNthLast(LinkedListNode head, int nth){
		
		LinkedListNode point = head;
		LinkedListNode runner = head;
		
		for(int i = 0; i< nth-1; i++){
			if(runner == null){
				return;
			}
			runner = runner.next;
		}
		
		if(runner == null){
			return;
		}
		
		while(runner.next!=null){
			point = point.next;
			runner = runner.next;
		}
		
		System.out.println("Find the result!");
		System.out.println(point.getData());
	}
	
	public static void main(String [] args){
		FindElement2 find = new FindElement2();
		
		LinkedListNode head = new LinkedListNode(1);
		head = head.addToTail(head, 2);
		head = head.addToTail(head, 3);
		
		find.findNthLast(head,3);
		
	}
}
