package TreeGraph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public void search(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		if(root == null){
			System.out.println("No node");
			return;
		}
		System.out.println("Node "+root.data+" is being visited!");
		root.isVisited = Node.visit.VISITED;
		queue.add(root);
		//first visit, then add, then poll its adj
		//for each node in the queue, after visiting all its ads(add the queue), pop the next; 
		while(queue.size()!=0){
			Node tmp = queue.poll();
			for(Node n:tmp.adjacent){
				if(n.isVisited == Node.visit.NOTVISITED){
					System.out.println("Node "+n.data+" is being visited!");
					n.isVisited = Node.visit.VISITED;
					queue.add(n);
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
		
		BFS bfs = new BFS();
		bfs.search(node1);
		
		
	}
	
}
