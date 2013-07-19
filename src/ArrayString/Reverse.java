package ArrayString;

public class Reverse {
	public String reverse(String str){
		char [] charArray = str.toCharArray();
		int fromHead = 0;
		int fromTail = charArray.length-1; 
		while(fromHead<fromTail){
			char tmp = charArray[fromHead];
			charArray[fromHead] = charArray[fromTail];
			charArray[fromTail] = tmp;
			fromHead++;
			fromTail--;
		}
		String result = charArrayToString(charArray);
		return result;
	}
	
	public String charArrayToString(char [] charArray){
		StringBuffer buffer = new StringBuffer();
		for (char c : charArray){
			buffer.append(c);
		}
		String result = buffer.toString();
		return result;
	}
	
	public static void main(String [] args){
		Reverse rev = new Reverse();
		String result = rev.reverse("Hello World");
		System.out.println(result);
	}
}
