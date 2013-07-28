package StackQueue;

public class Stack {
	private Node top;
	private int capacity;
	
	public Stack(){
		
	}
	
	public Stack(int _capacity){
		this.capacity = _capacity;
	}
	
	public boolean isFull(){
		return this.getLength()==capacity;
	}
	
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
	
	public int getLength(){
		Node point = top;
		int length = 0;
		while(point!=null){
			length ++;
			point = point.next;
		}
		return length;
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
		System.out.println(stack.getLength());
		
	}
}
