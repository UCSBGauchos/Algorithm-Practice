//implement an algorithm to determine if a string has all unique characters.

package ArrayString;

public class Unique {
	public boolean isUniqueChar(String str){
		if(str.length() > 256){
			return false;
		}
		boolean [] helper = new boolean[256];
		for (int i=0;i<str.length();i++){
			int charValue = str.charAt(i);
			if(helper[charValue]){
				return false;
			}
			helper[charValue] = true;
		}
		return true;
	}
	
	public static void main(String [] args){
		String testString1 = "abca";
		String testString2 = "abcdefg";
		Unique uni = new Unique();
		boolean result1 = uni.isUniqueChar(testString1);
		boolean result2 = uni.isUniqueChar(testString2);
		System.out.println(result1);
		System.out.println(result2);
	}
}
