package Recurse;

import java.util.ArrayList;

public class Permutation {
	public ArrayList<String> permutation(String str){
		if(str == null){
			return null;
		}
		//every time create a new ArrayList to avoid storing the old result
		ArrayList<String> permutations = new ArrayList<String>();
		if(str.length() == 0){
			permutations.add("");
			return permutations;
		}
		
		char firstChar = str.charAt(0);
		String remainder = str.substring(1);
		ArrayList<String> words = permutation(remainder);
		for(String word: words){
			for(int j=0; j<=word.length(); j++){
				String s = insertCharAt(word, firstChar, j);
				System.out.println(s);
				permutations.add(s);
			}
		}
		return permutations;
	}
		
	public String insertCharAt(String word, char c, int i){
		String firstPart = word.substring(0, i);
		String secondPart = word.substring(i);
		return firstPart +c +secondPart;
	}
		
		
		
	public static void main(String [] args){
		Permutation perm = new Permutation();
		String str = "abc";
		ArrayList<String> result = perm.permutation(str);
		System.out.println("The result is ");
		for(String word: result){
			System.out.println(word);
		}
	}
}
