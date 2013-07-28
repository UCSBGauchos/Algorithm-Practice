package StackQueue;

public class ThreeStack {
	int SrackSize = 100;
	int [] threeStack = new int [SrackSize * 3];
	int [] threeStackTop = {-1, -1, -1};
	
	public void push(int whichStack, int data) throws Exception {
		if(threeStackTop[whichStack]+1>=SrackSize){
			throw new Exception("out of space");
		}
		threeStackTop[whichStack] ++;
		threeStack[index(whichStack)] = data;
	}
	
	public int pop(int whichStack) throws Exception{
		if(threeStackTop[whichStack] == -1){
			throw new Exception("empty stack");
		}
		int result = threeStack[index(whichStack)];
		threeStackTop[whichStack] --;
		return result;
	}
	
	public int peek(int whichStack){
		return threeStack[index(whichStack)];
	}
	
	public int index(int whichStack){
		return whichStack*SrackSize+threeStackTop[whichStack]; 
	}
	
	public static void main(String [] args){
		ThreeStack three = new ThreeStack();
		try {
			three.push(0, 1);
			three.push(0, 2);
			three.push(0, 3);
			three.push(1, 1);
			three.push(1, 2);
			three.push(1, 3);
			three.push(2, 1);
			three.push(2, 2);
			three.push(2, 3);
		
			three.pop(0);
			three.pop(1);
			three.pop(2);
			
			System.out.println(three.peek(0));
			System.out.println(three.peek(1));
			System.out.println(three.peek(2));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
