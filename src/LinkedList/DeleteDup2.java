package LinkedList;

public class DeleteDup2 {
	public void deleteDups(LinkedListNode head){
		if (head == null){
			return;
		}
		LinkedListNode point = head;
		while(point!=null){
			LinkedListNode faster = point;
			while(faster.next!=null){
				if(faster.next.getData()==point.getData()){
					faster.next = faster.next.next;
				}else{
					faster = faster.next;
				}
			}
			point = point.next;
		}
	}
	
	public static void main(String [] args){
		LinkedListNode head = new LinkedListNode(1);
		head = head.addToTail(head, 2);
		head = head.addToTail(head, 3);
		head = head.addToTail(head, 4);
		head = head.addToTail(head, 5);
		head = head.addToTail(head, 1);
		
		DeleteDup2 dup = new DeleteDup2();
		dup.deleteDups(head);
		
		LinkedListNode point = head;
		while(point!=null){
			System.out.println(point.getData());
			point = point.next;
		}
	}
}
