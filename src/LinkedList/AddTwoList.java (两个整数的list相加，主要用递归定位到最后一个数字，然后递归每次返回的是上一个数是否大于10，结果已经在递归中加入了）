package LinkedList;

public class AddTwoList {
	public int addList(LinkedListNode l1, LinkedListNode l2, LinkedListNode resultList){
		
		int value = 0;
		int result = 0;
//		LinkedListNode point = resultList;
		
		if(l1 == null && l2 == null){
			return 0;
		}
		
	
		//resultList = resultList.next;
		
		if(l1 !=null || l2!=null){
			int recurse = addList(l1==null?null:l1.next, l2==null?null:l2.next, resultList);
			value = l1.getData()+l2.getData();
			result = (value)%10+recurse;
			//System.out.println(result);
			resultList = resultList.addToTail(resultList, result);
			
		}
		
		return value>=10?1:0;
		
		
	}
	
	public static void main(String [] args){
		LinkedListNode l1 = new LinkedListNode(6);
		l1 = l1.addToTail(l1, 1);
		l1 = l1.addToTail(l1, 7);
		
		LinkedListNode l2 = new LinkedListNode(2);
		l2 = l2.addToTail(l2, 9);
		l2 = l2.addToTail(l2, 5);
		
		AddTwoList add = new AddTwoList();
		
		LinkedListNode resultList = new LinkedListNode(0);
		
		int result= add.addList(l1, l2, resultList);
		
		LinkedListNode point = resultList.next;
		while(point!= null){
			System.out.println(point.getData());
			point = point.next;
		}
		
		
		
	}
}
