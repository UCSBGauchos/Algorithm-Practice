//replace all spaces in a string with %20

package ArrayString;

public class Replace {
	public String replaceSpaces(String str){
		int spaceNum = 0;
		char [] charArray = str.toCharArray();
		for(char c: charArray){
			if(c ==' '){
				spaceNum++;
			}
		}
		int newStringlength = spaceNum*2 + str.length();
		int index = 0;
		char [] newCharArray = new char[newStringlength]; 
		
		for(int i=0;i<newStringlength;i++){
			if(charArray[index]!=' '){
				newCharArray[i] = charArray[index];
				index++;
			}else{
				newCharArray[i] = '0';
				i++;
				newCharArray[i] = '2';
				i++;
				newCharArray[i] = '%';
				index++;
			}
		}
		String result = new String(newCharArray);
		return result;
	}
	
	public static void main(String [] args){
		String str = "Hello world";
		Replace rep = new Replace();
		System.out.println(rep.replaceSpaces(str));
	}
}
