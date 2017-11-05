package StackQueue;

import java.util.ArrayList;

public class StackSet {
	private ArrayList <Stack> stacks = new ArrayList<Stack>(); 
	
	public Stack getLastStack(){
		if(stacks.size() == 0){
			return null;
		}else{
			return stacks.get(stacks.size()-1);
		}
	}
	
	public boolean isEmpty(){
		return stacks.size() == 0;
	}
	
	public void push(int data){
		Stack last = getLastStack();
		if(last != null && !last.isFull()){
			last.push(data);
		}else{
			System.out.println("Need to create new stack");
			Stack stack = new Stack(5);
			stack.push(data);
			stacks.add(stack);
		}
	}
	
	public Node pop(){
		Stack last = getLastStack();
		if(last != null){
			Node result = last.pop();
			if(last.getLength() == 0){
				stacks.remove(stacks.size()-1);
			}
			return result;
		}else{
			return null;
		}
	}
	
	public static void main(String [] args){
		StackSet set = new StackSet();
		set.push(0);
		set.push(1);
		set.push(2);
		set.push(3);
		set.push(4);
		set.push(0);
		set.push(1);
		set.push(2);
		set.push(3);
		set.push(4);
	}
}
