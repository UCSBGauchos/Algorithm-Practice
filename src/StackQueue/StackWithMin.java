package StackQueue;

public class StackWithMin extends Stack{
	private Stack helpStack;
	public StackWithMin(){
		helpStack = new Stack();
	}
	
	public void push(int data){
		if(data<min()){
			helpStack.push(data);
			super.push(data);
		}else{
			super.push(data);
		}
	}
	
	public Node pop(){
		Node result = super.pop();
		if(result.data == min()){
			helpStack.pop();
		}
		return result;
	}
	
	public int getMin(){
		return helpStack.peek();
	}
	
	public int min(){
		if(helpStack.getLength() == 0){
			return Integer.MAX_VALUE;
		}else{
			return helpStack.peek();
		}
	}
	
	public static void main(String [] args){
		StackWithMin mStack = new StackWithMin();
		mStack.push(1);
		mStack.push(2);
		mStack.push(3);
		mStack.push(0);
		mStack.push(4);
		System.out.println(mStack.peek());
		System.out.println(mStack.getMin());
	}
}
