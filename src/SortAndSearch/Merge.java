package SortAndSearch;

public class Merge {
	//the length of array a is 10;
	//the length of array b is 5;
	void mergeTwoSortedArray(int [] a, int [] b, int [] helper){
		int i = b.length-1;
		int j = helper.length-1;
		int k = a.length-1;
		while(k>=0){
			if(i<0){
				a[k] = helper[j];
			}else if(j<0){
				a[k] = b[i];
			}else if(b[i] <= helper[j]){
				a[k] = helper[j];
				j--;
			}else if(b[i]>helper[j]){
				a[k] = b[i];
				i--;
			}
			k--;
		}	
	}
	public static void main(String [] args){
		int [] a = new int[10];
		int [] helper = new int[5];
		int [] b = {2,4,6,8,10};
		for(int i = 0; i<5; i++){
			helper[i] = 2*i+1;
		}
		Merge m = new Merge();
		m.mergeTwoSortedArray(a, b, helper);
		for(int i: a){
			System.out.println(i);
		}
	}
}
