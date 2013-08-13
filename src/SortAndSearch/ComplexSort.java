package SortAndSearch;

public class ComplexSort {
	public void createSortedArray(int [] array, int value){
		int index = 0;
		if(array == null){
			return;
		}
		if(index>=array.length){
			System.out.println("Out of bound");
			return;
		}else{
			while(array[index]<value && array[index]!=0){
				index++;
			}
			int tmp = 0;
			while(array[tmp] != 0){
				tmp++;
			}
			for(int i=tmp; i>index; i--){
				array[i] = array[i-1];
			}
			array[index] = value;
		}
	}
	
	//the input array should be sorted because
	public int easySort(int [] array, int value, int start, int end){
		int mid = (start+end)/2;
		if(start>end){
			return -1;
		}
		if(array[mid] == value){
			return mid;
		}else if(value < array[mid]){
			return easySort(array, value, start, mid-1);
		}else if(value > array[mid]){
			return easySort(array, value, mid+1, end);
		}
		return -1;
	}
	
	public static void main(String [] args){
		int [] array = new int[5];
		ComplexSort create = new ComplexSort();
		create.createSortedArray(array, 2);
		create.createSortedArray(array, 5);
		create.createSortedArray(array, 4);
		create.createSortedArray(array, 3);
		create.createSortedArray(array, 6);
		if(create.easySort(array, 6, 0, array.length-1)!=-1){
			System.out.println("find! The rank of "+6+"is "+create.easySort(array, 6, 0, array.length-1));
		}else{
			System.out.println("Not find!");
		}
	}
}
