package TreeGraph;

public class BinaryTreeValue {
	public void numPathEqualToSum(Node root, int sum, int value, int length){
		if (root == null){
			return;
		}
		
		value = value + root.data;
		length++;
		if(sum == value){
			System.out.println("find one path");
			System.out.println("The length is "+length);
		}
		numPathEqualToSum(root.left, sum, value, length);
		numPathEqualToSum(root.right, sum, value, length);
	}
	
	public static void main(String [] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(1);
		Node node6 = new Node(-1);
		
		node1.addLeft(node2);
		node1.addRight(node5);
		node2.addLeft(node3);
		node2.addRight(node4);
		node5.addRight(node6);
		
		BinaryTreeValue value = new BinaryTreeValue();
		value.numPathEqualToSum(node1, 10, 0, 0);
		
		
	}
}
