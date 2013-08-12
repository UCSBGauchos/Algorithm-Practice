package SortAndSearch;

public class FindWithEmpty {
	public int search(String [] array, String str, int start, int end){
		if(start > end){
			return -1;
		}
		if(str == null){
			return -1;
		}
		int mid = (start+end)/2;
		String midStr = array[mid];
		if(midStr == ""){
			int left = mid-1;
			int right = mid+1;
			while(true){
				if(left<start && right>end){
					return -1;
				}else if(right <= end && array[right]!=""){
					mid = right;
					break;
				}else if(left >= start && array[left]!=""){
					mid = left;
					break;
				}
			}
		}
		if(midStr == str){
			return mid;
		}else if(array[mid].compareTo(str)<0){
			return search(array, str, mid+1, end);
		}else{
			return search(array, str, start, mid-1);
		}
	}
	
	public static void main(String [] args){
		String [] array  = {"abc", "bcd", "cbc"};
		FindWithEmpty find = new FindWithEmpty();
		int result = find.search(array, "abc", 0, array.length-1);
		if(result == -1){
			System.out.println("Not find");
		}else{
			System.out.println("find");
		}
		
	}
}
