package LinkedList;

public class Partition {
	public LinkedListNode partitionList(LinkedListNode head, int pivot){
		
		LinkedListNode firstStart = null;
		LinkedListNode firstEnd = null;
		LinkedListNode secondStart = null;
		LinkedListNode secondEnd = null;
		
		LinkedListNode point = head;
		
		
		while(point!=null){
			LinkedListNode next = point.next;
			point.next = null;
			if(point.getData()<pivot){
				if(firstStart == null){
					firstStart = point;
					firstEnd = firstStart;
				}else{
					firstEnd.next = point;
					firstEnd = point;
				}
				System.out.println("This element is smaller");
				System.out.println(firstEnd.getData());
			}else{
				if(secondStart == null){
					secondStart = point;
					secondEnd = secondStart;
				}else{
					secondEnd.next = point;
					secondEnd = point;
				}
				System.out.println("This element is bigger");
				System.out.println(secondEnd.getData());
			}
			point = next;
		}
		
		System.out.println("pivot is");
		System.out.println(pivot);
		
		LinkedListNode test1 = firstStart;
		System.out.println("element in smaller");
		while(test1!=null){
			System.out.println(test1.getData());
			test1 = test1.next;
		}
		
		LinkedListNode test2 = secondStart;
		System.out.println("element in bigger");
		while(test2!=null){
			System.out.println(test2.getData());
			test2 = test2.next;
			
		}
		
		
		if(firstStart == null){
			return secondStart;
		}else{
			firstEnd.next = secondStart;
			return firstStart;
		}
	}
	
	public static void main(String [] args){
		LinkedListNode head = new LinkedListNode(6);
		head = head.addToTail(head, 3);
		head = head.addToTail(head, 1);
		head = head.addToTail(head, 9);
		head = head.addToTail(head, 2);
		head = head.addToTail(head, 1);
		head = head.addToTail(head, 1);
		
		Partition par = new Partition();
		
		head = par.partitionList(head, 3);
		
//		LinkedListNode point = head;
//
//		while(point!=null){
//			System.out.println(point.getData());
//			point = point.next;
//		}
	}
}
