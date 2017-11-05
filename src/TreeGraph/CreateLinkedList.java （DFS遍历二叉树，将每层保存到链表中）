package TreeGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateLinkedList {
	public void createLevelLinkedListDFS(Node root, ArrayList<LinkedList<Node>> lists, int level){
		if(root == null){
			return;
		}
//		create the list for each level
		LinkedList<Node> list = null;
		if(lists.size() == level){
			list = new LinkedList<Node> ();
			lists.add(list);
		}else{
			list = lists.get(level);
		}
		
		list.add(root);
		createLevelLinkedListDFS(root.left, lists, level+1);
		createLevelLinkedListDFS(root.right, lists, level+1);
		
		
	}
	
	public void createLevelLinkedListBFS(Node root, ArrayList<LinkedList<Node>> lists, int level){
		Queue<Node> queue = new LinkedList<Node> ();
		if(root == null){
			return;
		}
		LinkedList<Node> list = new LinkedList<Node>();
		list.add(root);
		queue.add(root);
		lists.add(list);
		int length = 0;
		while(queue.size() != 0){
			Node tmp = queue.poll();
			if(tmp.left!=null){
				queue.add(tmp.left);
				int leftLength = getLength(root, tmp.left);
				if(leftLength>=0){
					if(lists.size() == leftLength){
						list = new LinkedList<Node>();
						list.add(tmp.left);
						lists.add(list);
					}else{
						lists.get(leftLength).add(tmp.left);
					}
				}else{
					return;
				}
			}
			if(tmp.right!=null){
				queue.add(tmp.right);
				int rightLength = getLength(root, tmp.right);
				if(rightLength>=0){
					if(lists.size() == rightLength){
						list = new LinkedList<Node>();
						list.add(tmp.right);
						lists.add(list);
					}else{
						lists.get(rightLength).add(tmp.right);
					}
					
				}else{
					return;
				}
			}
		}
		
	}
	
	public int getLength(Node root, Node node){
//		int length;
//		base case
		if(root == node){
			return 0;
		}else if(root == null){
			return -999;
		}else{
			return Math.max(getLength(root.left, node), getLength(root.right, node))+1;
		}
		
		
		
	}
	
	public ArrayList<LinkedList<Node>> createLevelLinkedList(Node root){
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		createLevelLinkedListBFS(root, lists, 0);
		return lists;
	}
	
	public static void main(String [] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		
		node1.addLeft(node2);
		node1.addRight(node3);
		node2.addLeft(node4);
		node2.addRight(node5);
		node3.addLeft(node6);
		node3.addRight(node7);
		
		
		
		CreateLinkedList cll = new CreateLinkedList();
		ArrayList<LinkedList<Node>> lists = cll.createLevelLinkedList(node1);
		for(Node n:lists.get(2)){
			System.out.println(n.data);
		}
	}
}
