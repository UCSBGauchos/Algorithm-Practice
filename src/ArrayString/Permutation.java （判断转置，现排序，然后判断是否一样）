//determine whether two strings are permutation

package ArrayString;

public class Permutation {
	public String mySort(String inputString){
		char [] charArray = inputString.toCharArray();
		java.util.Arrays.sort(charArray);
		String sortedString = new String(charArray);
		return sortedString;
	}
	
	public boolean permutation(String s1, String s2){
		if (s1.length()!= s2.length()){
			return false;
		}else{
			return mySort(s1).equals(mySort(s2));
		}
	}
	
	public static void main(String [] args){
		Permutation per = new Permutation();
		String s1 = "abc";
		String s2 = "cba";
		System.out.println(per.permutation(s1, s2));
		
	}
}
