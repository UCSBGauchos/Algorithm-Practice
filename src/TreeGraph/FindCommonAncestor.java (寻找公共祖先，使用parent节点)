package TreeGraph;

public class FindCommonAncestor {
	public Node findAncestor(Node node1, Node node2){
		if(node1 == null || node2 == null){
			return null;
		}
		
		
		while(node1.parent != null || node2.parent != null){
			if(node1.parent != null && node2.parent != null){
				if(node1.parent != node2.parent){
					node1 = node1.parent;
					node2 = node2.parent;
				}else{
					return node1.parent;
				}
			}else if(node1.parent != null){
				if(node1.parent != node2){
					node1 = node1.parent;
				}else{
					return node2;
				}
			}else if(node2.parent != null){
				if(node1 != node2.parent){
					node2 = node2.parent;
				}else{
					return node1;
				}
			}
		}
		return null;
	}
	
	public static void main(String [] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.addLeft(node2);
		node1.addRight(node4);
		node2.addLeft(node3);
		
		FindCommonAncestor fa = new FindCommonAncestor();
		System.out.println(fa.findAncestor(node3, node3).data);
	}
}
