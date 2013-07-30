package TreeGraph;

public class DFS {
	public void search (Node root){
		if(root == null){
			System.out.println("No node");
			return;
		}else{
			System.out.println("Node "+root.data+" is being visited!");
			root.isVisited = Node.visit.VISITED;
			for(Node n:root.adjacent){
				if(n.isVisited == Node.visit.NOTVISITED){
					search(n);
				}
			}
		}
	}
	
	public static void main(String [] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		node1.addAD(node2);
		node1.addAD(node3);
		node2.addAD(node3);
		node1.addAD(node3);
		
		DFS dfs = new DFS();
		dfs.search(node1);
		
		
	}
}
