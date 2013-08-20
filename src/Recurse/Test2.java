package Recurse;

public class Test2 {
	public Node recurse(Node node, int length){
		if(length == 1){
			return node.next;
		}
		if(length == 0){
			return node.next;
		}
		
		Node n = recurse(node.next, length-2);
		if(n.data == node.data){
			System.out.println("Equal!");
		}
		n = n.next;
		return n;
		
	}
	
	public static void main(String [] args){
		Test2 t2 = new Test2();
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		 t2.recurse(n1, 5);
	}
}
