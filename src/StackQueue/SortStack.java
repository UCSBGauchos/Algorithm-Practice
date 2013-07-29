package StackQueue;

public class SortStack {
	public Stack sort(Stack s){
		Stack helper = new Stack();
		while(s.getLength()!=0){
			int tmp = s.pop().data;
			//important! Do the first part first! 
			while(helper.getLength()!=0 && helper.peek()>tmp){
				s.push(helper.pop().data);
			}
			helper.push(tmp);
		}
		return helper;
	}
	
	public static void main(String [] args){
		Stack stack = new Stack();
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(6);
		SortStack sort = new SortStack();
		Stack result = sort.sort(stack);
		while(result.getLength()!=0){
			System.out.println(result.pop().data);
		}
	}
}
