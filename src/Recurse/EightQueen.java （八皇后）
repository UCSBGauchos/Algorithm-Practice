package Recurse;

import java.util.ArrayList;

//each array is for one matrix, column[row] =c means row r has queen ar c col
public class EightQueen {
	public final int grid_size = 8;
	
	public void placeQueens(int row, Integer [] columns, ArrayList<Integer[]> result){
		if(row == grid_size){
			result.add(columns.clone());
		}else{
			for(int col=0; col<grid_size; col++){
				//if col in row is OK, set this row, recursively go to next row
				//if it is not OK, try next col in this row
				//when the next row return recursively, still try next col until col_size
				if(check(columns, row, col)){
					columns[row] = col;
					placeQueens(row+1, columns, result);
				}
			}
		}
	}
	public boolean check(Integer [] columns, int row, int column){
		for(int i=0; i<row; i++){
			int tmp = columns[i];//ith row's queens
			if(column == tmp){
				return false;
			}
			int rowDiff = Math.abs(i-row);
			int colDiff = Math.abs(tmp-column);
			if(rowDiff == colDiff){
				return false;
			}
		}
		return true;
		
		
	}
}
