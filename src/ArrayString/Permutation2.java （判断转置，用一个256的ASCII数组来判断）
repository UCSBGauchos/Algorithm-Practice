package ArrayString;

public class Permutation2 {
	public boolean permutation(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		int [] helper = new int[256];
		char [] charArray = s1.toCharArray();
		
		for(char c:charArray){
			int ASCII = (int)c;
			helper[ASCII]++;
		}
		
		for(int i=0;i<s2.length();i++){
			helper[s2.charAt(i)]--;
			if(helper[s2.charAt(i)]<0){
				return false;
			}
		}
		return true; 
	}	 
	
	public static void main(String [] args){
		String str1 = "abc";
		String str2 = "bca";
		Permutation2 per2 = new Permutation2(); 
		System.out.println(per2.permutation(str1, str2));
	}
}
