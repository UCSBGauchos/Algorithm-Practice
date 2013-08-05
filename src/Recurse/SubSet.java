package Recurse;

import java.util.ArrayList;

public class SubSet {
	ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
		if(set.size() == 0){
			ArrayList<Integer> emptySet = new ArrayList<Integer>();
			subsets.add(emptySet);
			return subsets;
		}
		
		int item = set.get(0);
		set.remove(0);
		subsets = getSubset(set);
		ArrayList<ArrayList<Integer>> moreSets = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> a:subsets){
			ArrayList<Integer> newSet = new ArrayList<Integer>();
			newSet.addAll(a);
			newSet.add(item);
			moreSets.add(newSet);
		}
		subsets.addAll(moreSets);
		return subsets;
	}
	
	public static void main(String [] args){
		SubSet s = new SubSet();
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		ArrayList<ArrayList<Integer>> subsets = s.getSubset(set);
		for(ArrayList<Integer> a: subsets){
			System.out.print("{");
			for(int i: a){
				System.out.print(i);
			}
			System.out.println("}");
			
		}
		
	}
}
