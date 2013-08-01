package TreeGraph;

public class FindTheNext {
	public Node find(Node node){
		if(node == null){
			return null;
		}
		
		if(node.right!=null){
			return leftMostChild(node.right);
		}else{
//			System.out.println(node.parent.parent.data);
			while(node.parent!=null && node.parent.left == null){
				node = node.parent;
			}
			if(node.parent == null){
				System.out.println("node"+node.data+" doesn't have next node");
				return node;
			}
		}
		return node.parent;
	}
	
	public Node leftMostChild(Node node){
		if(node == null){
			return null;
		}
		while(node.left!=null){
			node = node.left;
		}
		
		return node;
	}
	
	public static void main(String [] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		node1.addLeft(node2);
		node2.addRight(node3);
		
		FindTheNext find = new FindTheNext();
		System.out.println("The next node of node2 is node"+find.find(node2).data);
		System.out.println("The next node of node3 is node"+find.find(node3).data);
		System.out.println("The next node of node1 is node"+find.find(node1).data);
		
		
	}
}
