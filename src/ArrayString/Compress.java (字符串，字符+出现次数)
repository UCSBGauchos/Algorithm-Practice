package ArrayString;

public class Compress {
	public String compressString(String str){
		char last = str.charAt(0);
		String result = "";
		int charCount = 1;
		for (int i=1;i<str.length();i++){
			if(str.charAt(i)==last){
				charCount++;
			}else{
				result = result+last+charCount;
				charCount = 1;
				last = str.charAt(i);
			}
		}
		result = result+last+charCount;
		return result;
	}
	
	public static void main(String [] args){
		Compress comp = new Compress();
		System.out.println(comp.compressString("aabcccccaaa"));
	}
}
