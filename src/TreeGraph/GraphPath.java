package TreeGraph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphPath {
	public boolean hasPath(Node start, Node end){
		Queue<Node> queue = new LinkedList<Node>();
		if(start == null || start == null){
			return false;
		}else{
			start.isVisited = Node.visit.VISITED;
			System.out.println("Node "+start.data+" is being visited");
			queue.add(start);
		}
		while(queue.size()!=0){
			Node tmp = queue.poll();
			for(Node n: tmp.adjacent){
				if(n.isVisited == Node.visit.NOTVISITED){
					n.isVisited = Node.visit.VISITED;
					System.out.println("Node "+n.data+" is being visited");
					if(n == end){
						return true;
					}
					queue.add(n);
				}
			}
		}
		return false;
	}
	
	public static void main(String [] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.addAD(node2);
		node1.addAD(node3);
		node2.addAD(node3);
		
		
		GraphPath gp = new GraphPath();
		if(gp.hasPath(node2, node4)){
			System.out.println("Exist a path");
		}else{
			System.out.println("No exist");
		}
	}
}
