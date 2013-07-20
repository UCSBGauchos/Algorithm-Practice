package ArrayString;

public class SubString {
	
	public boolean isSubstring(String s1, String s2){
		char [] charArray1 = s1.toCharArray();//original
		char [] charArray2 = s2.toCharArray();//sub
		boolean isBegin = false;
		for (int j=0;j<charArray2.length;j++){
			int tmp = j;
			for (int i=0;i< charArray1.length;i++){
				if(charArray2[j] == charArray1[i]){
					isBegin = true; 
					j++;
					if(j==charArray2.length){
						return true;
					}
				}else{
					j = tmp;
					if(isBegin == true){
						return false;
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String [] args){
		String original = "eabcd";
		String sub = "ed";
		SubString su = new SubString();
		System.out.println(su.isSubstring(original, sub));
	}

}
