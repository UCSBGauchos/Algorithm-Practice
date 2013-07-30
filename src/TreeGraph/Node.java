package TreeGraph;

import java.util.ArrayList;

public class Node {
	
	//for tree
	public Node right;
	public Node left;
	public Node father;
	
	public int data;
	//for graph
	private final int NOTVISITED = 0;
	private final int VISITED = 1;
	public enum visit{
		NOTVISITED,
		VISITED
	}
	public ArrayList<Node> adjacent;
	public visit isVisited;
	
	public Node (int _data){
		this.right = null;
		this.left = null;
		this.father = null;
		this.adjacent = new ArrayList<Node> ();
		this.data = _data;
		this.isVisited = visit.NOTVISITED; 
	}
	
	public void addAD(Node n){
		if(this.adjacent.size()!= 0){
			for(Node node:this.adjacent){
				if(node == n){
					System.out.println("Node "+this.data+" and Node "+node.data+" have already been connected!");
					return;
				}
			}
		}
		this.adjacent.add(n);
		n.adjacent.add(this);
	}
	
	public void addLeft(Node n){
		this.left = n;
		//this.left.father = this;
		if(n != null){
			this.left.father = this;
		}
	}
	
	public void addRight(Node n){
		this.right = n;
		//this.right.father = this;
		if(n != null){
			this.right.father = this;
		}
	}
	
}
