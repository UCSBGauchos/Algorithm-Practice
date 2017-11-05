package StackQueue;

public class Queue {
	private Node top;
	private Node bot;
	
	public void enqueue(int data){
		if(bot == null){
			Node tmp = new Node(data);
			bot = tmp;
			top = tmp;
		}else{
			Node tmp = new Node(data);
			top.next = tmp;
			top = tmp;
		}
	}
	
	public Node dequeue(){
		if(bot != null){
			Node tmp = bot;
			bot = bot.next;
			return tmp;
		}
		return null;
	}
	
	public static void main(String [] args){
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println(queue.dequeue().data);
		System.out.println(queue.dequeue().data);
		System.out.println(queue.dequeue().data);
	}
}
