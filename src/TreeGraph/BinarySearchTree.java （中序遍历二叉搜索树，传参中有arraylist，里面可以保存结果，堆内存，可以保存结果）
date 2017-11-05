package TreeGraph;

import java.util.ArrayList;

public class BinarySearchTree {
	public void checkBinSearchTree(Node root, ArrayList<Integer> resultArray){
		if(root == null){
			return;
		}
		
		checkBinSearchTree(root.left, resultArray);
		resultArray.add(root.data);
		checkBinSearchTree(root.right, resultArray);
		
	}
	
	public static void main(String [] args){
		BinarySearchTree bin = new BinarySearchTree();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		
		node4.addLeft(node2);
		node4.addRight(node6);
		node2.addLeft(node1);
		node2.addRight(node3);
		node6.addLeft(node5);
		node6.addRight(node7);
		
		ArrayList<Integer> resultArray = new ArrayList<Integer> ();
		bin.checkBinSearchTree(node4, resultArray);
		
		for(int index = 1;index<resultArray.size();index++){
			if(resultArray.get(index)<resultArray.get(index-1)){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		
	}
}
