// rotate the matirx

package ArrayString;

public class RotateMatrix {
	public void rotate(int [][] matrix, int n){
		for(int layer = 0; layer<n/2; layer++){
			int begin = layer;
			int end = n-1-layer;
			for(int i=begin; i<end; i++){
				int move = i-begin;
				//save top
				int top = matrix[begin][i];
				//left->top
				matrix[begin][i] = matrix[end-move][begin];
				//bottom->left
				matrix[end-move][begin] = matrix[end][end-move];
				//right->bottom
				matrix[end][end-move] = matrix[i][end];
				//top->right
				matrix[i][end] = top;
			}
		}
	}
}
