package SortAndSearch;

public class SearchInMatrix {
	public boolean find(int [][] matrix, int element){
		int row = 0;
		int col = matrix[0].length-1;
		while(row<matrix.length && col >=0){
			if(matrix[row][col] == element){
				return true;
			}else if(matrix[row][col] > element){
				col--;
			}else if(matrix[row][col] < element){
				row++;
			}
		}
		return false;
	}
	
	public static void main(String [] args){
		int [][] matrix = new int[2][2];
		matrix[0][0] = 20;
		matrix[0][1] = 35;
		matrix[1][0] = 30;
		matrix[1][1] = 55;
		SearchInMatrix search = new SearchInMatrix();
		if(search.find(matrix, 30)==true){
			System.out.println("find!");
		}else{
			System.out.println("not find!");
		}
	}
}
