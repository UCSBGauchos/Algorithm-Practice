package LinkedList;

import java.util.Hashtable;

public class DeleteDup {
	public void delete(LinkedListNode head){
		Hashtable table = new Hashtable();
		LinkedListNode previous = null;
		LinkedListNode current = head;
		
		while(current != null){
			if(table.contains(current.getData())){
				previous.next = current.next;
			}else{
				table.put(current.getData(), true);
				previous = current;
			}
		}
	}
}
