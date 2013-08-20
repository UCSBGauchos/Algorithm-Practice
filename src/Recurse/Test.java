package Recurse;

import java.util.ArrayList;

public class Test {
	public int testSummary(int index, int [] list, ArrayList<Integer> result){
		int previous = 0;
		System.out.println("pre index is "+index);
		if(index>list.length-1){
			return 0;
		}
		index = index+1;
		int a = testSummary(index, list, result);
		System.out.println("after index is "+index);
		int current = list[index-1] + a;
		result.add(current);
		previous = current;
		return previous;
	}
	
	public static void main(String [] args){
		int [] list = {1, 2, 3};
		Test t = new Test();
		ArrayList<Integer> result = new ArrayList<Integer>();
		System.out.println(t.testSummary(0, list, result));
		
	}
}
