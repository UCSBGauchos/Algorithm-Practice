package TreeGraph;

public class SuperSumValue {
	public int depth(Node root){
		if (root == null){
			return 0;
		}
		return Math.max(depth(root.left), depth(root.right))+1;
	}
	
	//the node can be normal node
	public int findSum(Node root, Node node){
		// use POST-ORDER to find the sum
		if(root == node){
			System.out.println("Find the node");
			return node.data;
		}
		
		if(root == null){
			return -10000;
		}
		
		int left = findSum(root.left, node);
		int right = findSum(root.right, node);
		if(left > 0){
			return left+root.data;
		}
		if(right >0){
			return right+root.data;
		}
		return -10000;
	}
	
	public static void main(String [] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		
		node1.addLeft(node2);
		node1.addRight(node5);
		node2.addLeft(node3);
		node2.addRight(node4);
		node5.addRight(node6);
		
		SuperSumValue value = new SuperSumValue();
		System.out.println(value.findSum(node1, node4));
	}
}
