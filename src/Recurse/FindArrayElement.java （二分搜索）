package Recurse;

public class FindArrayElement {
	public int[] stringToIntArray(String array){
		char [] charArray = array.toCharArray();
		int [] intArray = new int [array.length()];
		int index = 0;
		for(char c: charArray){
			intArray[index] = c-48;
			index++;
		}
		return intArray;
	}
	
	public void binaryMagicSearch(int [] intArray, int begin, int end){
		if(end<begin){
			return ;
		}
		int midIndex = (end+begin)/2;
		int midValue = intArray[midIndex];
		if(midIndex == midValue){
			System.out.println("Find! "+midValue);
			return;
		}
		int leftEnd = Math.min(midIndex-1, midValue);
		binaryMagicSearch(intArray, begin, leftEnd);
		
		int rightBegin = Math.max(midIndex+1, midValue);
		binaryMagicSearch(intArray, rightBegin, end);
			
	}
	
	public static void main(String [] args){
		//String str = "12334";
		FindArrayElement find = new FindArrayElement();
		int [] intArray = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
		int begin = 0;
		int end = intArray.length-1;
		find.binaryMagicSearch(intArray, begin, end);
	}
	
}
