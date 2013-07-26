package StackQueue;

public class Stack {
	private Node top;
	
	public Node pop(){
		if(top != null){
			Node tmp = top;
			top = top.next;
			return tmp;
		}else{
			return null;
		}
	}
	
	public void push(int data){
		Node tmp = new Node(data);
		tmp.next = top;
		top = tmp;
	}
	
	public int peek(){
		return top.data;
	}
	
	public static void main(String [] args){
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		Node tmp = stack.pop();
		int result = stack.peek();
		System.out.println(tmp.data);
		System.out.println(result);
		
	}
}
