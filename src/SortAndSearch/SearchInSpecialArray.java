package SortAndSearch;

public class SearchInSpecialArray {
	public int search(int [] array, int left, int right, int x){
		if(right < left){
			return -1;
		}
		int mid = (left+right)/2;
		if(x == array[mid]){
			return mid;
		}
		if(array[left] <= array[mid]){
			if(x>=array[left]&&x<=array[mid]){
				return search(array, left, mid-1, x);
			}else{
				return search(array, mid+1, right, x);
			}
		}else if(array[mid]<array[left]){
			if(x>=array[mid]&&x<=array[right]){
				return search(array, mid+1, right,x);
			}else{
				return search(array, left, mid-1, x);
			}
		}
		return -1;
	}
	public static void main(String [] args){
		int [] array = {10,15,20,0,5};
		SearchInSpecialArray search = new SearchInSpecialArray();
		if(search.search(array, 0, array.length-1, 15)!=-1){
			System.out.println("Find!");
		}else{
			System.out.println("Not Find!");
		}
	}
}
