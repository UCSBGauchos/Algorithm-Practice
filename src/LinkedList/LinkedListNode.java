package LinkedList;

public class LinkedListNode {
	public LinkedListNode next;
	private int data;
	
	public LinkedListNode(int _data){
		this.data = _data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public LinkedListNode getObject(){
		return this;
	}
	
	public LinkedListNode addToTail(LinkedListNode head, int _data){
		LinkedListNode node = head;
		while(node.next != null){
			node = node.next;
		}
		LinkedListNode tailNode = new LinkedListNode(_data);
		node.next = tailNode;
		return head;
	}
	
	public LinkedListNode deleteSelectNode(LinkedListNode head, int _data){
		if(head.getData() == _data){
			head = head.next; 
			return head;
		}
		
		LinkedListNode node = head;
		LinkedListNode previous = null;
	
		while(node!=null){
			if(node.getData()==_data){
				previous.next = node.next;
				return head;
			}else{
				previous = node;
			}
			node = node.next;
		}
		return head;
	}
	
	public static void main(String [] args){
		LinkedListNode head = new LinkedListNode(1);
		head = head.addToTail(head, 2);
		head = head.addToTail(head, 3);
		head = head.addToTail(head, 4);
		head = head.addToTail(head, 5);
		head = head.deleteSelectNode(head, 1);
		head = head.deleteSelectNode(head, 5);
		head = head.deleteSelectNode(head, 3);
		
		LinkedListNode point = head;

		while(point!=null){
		System.out.println(point.getData());
		point = point.next;
		}
	}
}
