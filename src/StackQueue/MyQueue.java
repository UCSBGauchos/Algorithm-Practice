package StackQueue;

public class MyQueue {
	private Stack newStack;
	private Stack oldStack;
	
	public MyQueue(){
		newStack = new Stack();
		oldStack = new Stack();
	}
	
	public int size(){
		return newStack.getLength()+oldStack.getLength();
	}
	
	public void enqueue(int data){
		newStack.push(data);
	}
	
	private void moveNewToOld(){
		if(oldStack.getLength()==0){
			while(newStack.getLength()!=0){
				oldStack.push(newStack.pop().data);
			}
		}
	}
	
	public int dequeue(){
		moveNewToOld();
		return oldStack.pop().data;
	}
	
	public int peek(){
		moveNewToOld();
		return oldStack.peek();
	}
	
	public static void main(String [] args){
		MyQueue queue = new MyQueue();
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		
		
	}
}
