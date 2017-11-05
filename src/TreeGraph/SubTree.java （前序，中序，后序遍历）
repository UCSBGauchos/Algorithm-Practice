package TreeGraph;

public class SubTree {
	public void inOrder(Node root, StringBuffer IOresult){
		if(root == null){
			//System.out.println("visiting 0");
			IOresult = IOresult.append(0);
			return;
		}
		
		inOrder(root.left, IOresult);
		//System.out.println("visiting "+root.data);
		IOresult = IOresult.append(root.data);
		inOrder(root.right, IOresult);
	}
	
	public void preOrder(Node root, StringBuffer POresult){
		if(root == null){
			//System.out.println("visiting 0");
			POresult = POresult.append(0);
			return;
		}
		//System.out.println("visiting "+root.data);
		POresult = POresult.append(root.data);
		preOrder(root.left, POresult);
		preOrder(root.right, POresult);
	}

//	public void postOrder(Node root){
//		if(root == null){
//			System.out.println("visiting 0");
//			return;
//		}
//		postOrder(root.left);
//		postOrder(root.right);
//		System.out.println("visiting "+root.data);
//		
//	}
	
	public boolean subString(String string, String subString){
		if(subString == null){
			return true;
		}
		
		if(string == null){
			return false;
		}
		
		char [] charArray = string.toCharArray();//original
		char [] subCharArray = subString.toCharArray();//sub
		boolean isBegin = false;
		for (int j=0;j<subCharArray.length;j++){
			int tmp = j;
			for (int i=0;i< charArray.length;i++){
				if(subCharArray[j] == charArray[i]){
					isBegin = true; 
					j++;
					if(j==subCharArray.length){
						return true;
					}
				}else{
					if(subCharArray[j] == '0'){
						return true;
					}
					j = tmp;
					if(isBegin == true){
						return false;
					}
				}
			}
		}
		return false;
		
	}
	
	public static void main(String [] args){
		SubTree sub = new SubTree();
		
		Node subRoot = new Node(3);
		Node subNode1 = new Node(3);
		subRoot.addLeft(subNode1);
		
		Node root = new Node(3);
		Node node1 = new Node(3);
		Node node2 = new Node(4);
		root.addLeft(node1);
		root.addRight(node2);

		//for tree
		StringBuffer IOresult = new StringBuffer();
		StringBuffer POresult = new StringBuffer();
		sub.inOrder(root, IOresult);
		sub.preOrder(root, POresult);
		String IOString = IOresult.toString();
		String POString = POresult.toString();
		System.out.println(IOString);
		System.out.println(POString);
		
		//for subtree
		StringBuffer SubIOresult = new StringBuffer();
		StringBuffer SubPOresult = new StringBuffer();
		sub.inOrder(subRoot, SubIOresult);
		sub.preOrder(subRoot, SubPOresult);
		String SubIOString = SubIOresult.toString();
		String SubPOString = SubPOresult.toString();
		System.out.println(SubIOString);
		System.out.println(SubPOString);
		
		boolean isPOSame = sub.subString(POString, SubPOString);
		boolean isIOSame = sub.subString(IOString, SubIOString);
		
		if(isPOSame && isIOSame){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		
		
		//sub.inOrder(node1);
		//sub.preOrder(node1);
		//sub.postOrder(node1);
		
	}
}
