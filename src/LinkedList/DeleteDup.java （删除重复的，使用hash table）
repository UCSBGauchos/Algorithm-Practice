package LinkedList;

import java.util.Hashtable;

public class DeleteDup {
	public LinkedListNode delete(LinkedListNode head){
		Hashtable table = new Hashtable();
		LinkedListNode current = head;
		
		while(current != null){
			if(table.containsKey(current.getData())){
				head = head.deleteSelectNode(head, current.getData());
			}else{
				table.put(current.getData(), true);
			}
			current = current.next;
		}
		return head;
	}
	
	public static void main(String [] args){
		LinkedListNode head = new LinkedListNode(1);
		head = head.addToTail(head, 2);
		head = head.addToTail(head, 3);
		head = head.addToTail(head, 3);
		
		
		DeleteDup dele = new DeleteDup();
		
		head = dele.delete(head);
		
		LinkedListNode point = head;
		
		while(point!=null){
			System.out.println(point.getData());
			point = point.next;
		}
		
	}
}
