package TreeGraph;

public class BinaryTree {
	public int getHeight(Node root){
		if(root == null){
			return 0;
		}else{
			return Math.max(getHeight(root.left), getHeight(root.right))+1;
		}
	}
	
	public boolean isBalance(Node root){
		if(root == null){
			return true;
		}else{
			int diff = getHeight(root.left)-getHeight(root.right);
			if(Math.abs(diff)<=1){
				return isBalance(root.left) && isBalance(root.right);
			}else{
				return false;
			}
		}
	}
	
	public static void main(String [] args){
		Node root = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		root.addLeft(node2);
		root.addRight(node3);
		node2.addLeft(node3);
		node2.addRight(node4);
		BinaryTree bin = new BinaryTree();
		System.out.println(bin.getHeight(root));
		System.out.println(bin.isBalance(root));
		
	}
}
