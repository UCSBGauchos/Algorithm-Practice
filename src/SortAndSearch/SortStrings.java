package SortAndSearch;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class SortStrings {
	
	public String anagramToSort(String s){
		char [] charArray = s.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
	
	public void sort(String [] array){
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		for(String s: array){
			String key = anagramToSort(s);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			hash.get(key).push(s);
		}
		
		int index = 0;
		for(String key: hash.keySet()){
			LinkedList<String> list = hash.get(key);
			for(String s: list){
				array[index] = s;
				index++;
			}
		}
	}
	
	public static void main(String [] args){
		SortStrings s = new SortStrings();
		String [] array = {"rabat", "cat", "tabar", "tac"};
		s.sort(array);
		for(String string: array){
			System.out.println(string);
		}
	}
}
