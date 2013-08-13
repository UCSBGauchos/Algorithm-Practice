package SortAndSearch;

import java.util.ArrayList;

public class ComplexSort {
	int traverse = 0;
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
	
	public void createBinarySearchTree(Node root, Node node){
		if(root == null){
			return;
		}else if(node == null){
			return;
		}
		
		if(node.data<root.data && root.left!=null){
			createBinarySearchTree(root.left, node);
		}else if(node.data<root.data && root.left == null){
			root.left = node;
		}else if(node.data>root.data && root.right!=null){
			createBinarySearchTree(root.right, node);
		}else if(node.data>root.data && root.right == null){
			root.right = node;
		}
	}
	
	public int sortInBinarySearchTree(Node root, int value){
		if(root.data == value){
			return value;
		}
		if(value>root.data){
			if(root.right!=null){
				return sortInBinarySearchTree(root.right, value);
			}
		}else if(value<root.data){
			if(root.left!=null){
				return sortInBinarySearchTree(root.left, value);
			}
		}
		return -1;
	}
	
	public void getRank(Node root, Node node, ArrayList<Node> helper){
		if(root == null){
			return;
		}
		if(root.data<node.data){
			traverse++;
			helper.add(root);
			System.out.println("Find "+root.data+" below "+node.data);				
		}
		getRank(root.left, node, helper);
		getRank(root.right, node, helper);
	}
	
	public static void main(String [] args){
//		int [] array = new int[5];
		ComplexSort create = new ComplexSort();
//		create.createSortedArray(array, 2);
//		create.createSortedArray(array, 5);
//		create.createSortedArray(array, 4);
//		create.createSortedArray(array, 3);
//		create.createSortedArray(array, 6);
//		if(create.easySort(array, 6, 0, array.length-1)!=-1){
//			System.out.println("find! The rank of "+6+" is "+create.easySort(array, 6, 0, array.length-1));
//		}else{
//			System.out.println("Not find!");
//		}
		Node node1 = new Node(20);
		Node node2 = new Node(15);
		Node node3 = new Node(25);
		Node node4 = new Node(10);
		Node node5 = new Node(5);
		Node node6 = new Node(13);
		Node node7 = new Node(23);
		Node node8 = new Node(24);
		
		create.createBinarySearchTree(node1, node2);
		create.createBinarySearchTree(node1, node3);
		create.createBinarySearchTree(node1, node4);
		create.createBinarySearchTree(node1, node5);
		create.createBinarySearchTree(node1, node6);
		create.createBinarySearchTree(node1, node7);
		create.createBinarySearchTree(node1, node8);

//		if(create.sortInBinarySearchTree(node1, 14) != -1){
//			System.out.println("find");
//		}else{
//			System.out.println("Not find");
//		}
		
		ArrayList<Node> helper = new ArrayList<Node>();
		create.getRank(node1, node8, helper);
		System.out.println("The rank of "+node8.data+" is "+helper.size());
	}
}
