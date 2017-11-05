package Recurse;

import java.util.ArrayList;

public class BracketPair {
	public ArrayList<String> getPair(int n){
	
		ArrayList<String> currentPair = new ArrayList<String>();
		if(n == 0){
			currentPair.add("");
			return currentPair;
		}
		ArrayList<String> previousPair = getPair(n-1);
		for(String previous: previousPair){
			for(int i=0; i<=previous.length(); i++){
				String now = connect(previous, i);
				if(!currentPair.contains(now)){
					currentPair.add(now);
				}
			}
		}
		return currentPair;
		
	}
	
	public String connect(String str, int i){
		String firstPart = str.substring(0, i);
		String secondPart = str.substring(i);
		return firstPart + "()" +secondPart;
	}
	
	public static void main(String [] args){
		ArrayList<String> result = new ArrayList<String>();
		BracketPair bp = new BracketPair();
		result = bp.getPair(3);
		for(String s: result){
			System.out.println(s);
		}
	}
	
}
