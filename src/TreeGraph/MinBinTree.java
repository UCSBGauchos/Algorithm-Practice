package TreeGraph;

public class MinBinTree {
	public Node createMinBinTree(int [] array, int start, int end){
		if(end < start){
			return null;
		}else{
			int mid = (start+end)/2;
			Node root = new Node(array[mid]);
			root.addLeft(createMinBinTree(array, start, mid-1));
			root.addRight(createMinBinTree(array, mid+1, end));
			return root;
		}
	}

	public int getHeight(Node root){
		if(root == null){
			return 0;
		}else{
			return Math.max(getHeight(root.left), getHeight(root.right))+1;
		}
	}
	
	public static void main(String [] args){
		MinBinTree min = new MinBinTree();
		int [] array = {1,2,3,4,5};
		System.out.println(min.getHeight(min.createMinBinTree(array, 0, 4)));
	}
}
