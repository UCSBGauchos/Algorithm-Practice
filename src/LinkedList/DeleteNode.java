package LinkedList;

public class DeleteNode {
	public void deleteOneNode(LinkedListNode node){
		if(node == null||node.next == null){
			System.out.println("This node cnnot be deleted!");
			return;
		}else{
			node.data = node.next.data;
			node.next = node.next.next;
		}
	}
	
	public static void main(String [] args){
		DeleteNode del = new DeleteNode();
		
		LinkedListNode head = new LinkedListNode(1);
		head = head.addToTail(head, 2);
		head = head.addToTail(head, 3);
		
		LinkedListNode wantDel = head.next;
		del.deleteOneNode(wantDel);
		
		LinkedListNode point = head;
		
		while(point!=null){
			System.out.println(point.getData());
			point = point.next;
		}
	}
}
