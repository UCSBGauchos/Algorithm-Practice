package Recurse;

import java.util.ArrayList;

public class TallestBoxTower {
	public ArrayList<BoxClassForBoxTower> createBoxTower(BoxClassForBoxTower [] boxes, BoxClassForBoxTower bottom){
		
		ArrayList<BoxClassForBoxTower> previousTower = null;
		int maxHeight = 0;
		
		for(int i=0; i<boxes.length; i++){
			if(canBeAbove(boxes[i],bottom)){
				ArrayList<BoxClassForBoxTower> currentTower = createBoxTower(boxes, boxes[i]);
				int height = getHeight(currentTower);
				if(height > maxHeight){
					previousTower = currentTower;
					maxHeight = height;
				}
			}
		}
		
		if(previousTower == null){
			previousTower = new ArrayList<BoxClassForBoxTower>();
		}
		
		if(bottom != null){
			previousTower.add(bottom);
		}
		return previousTower;
		
	}
	
	int getHeight(ArrayList<BoxClassForBoxTower> BoxTower){
		int height = 0;
		for(BoxClassForBoxTower box: BoxTower){
			height+=box.getHeight();
		}
		return height;
	}
	
	public boolean canBeAbove(BoxClassForBoxTower top, BoxClassForBoxTower bottom){
		if(top.getDepth()<bottom.getDepth() && top.getHeight()<bottom.getHeight() && top.getWidth()<bottom.getWidth()){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String [] args){
		BoxClassForBoxTower box1 = new BoxClassForBoxTower(10,10,10);
		BoxClassForBoxTower box2 = new BoxClassForBoxTower(20,20,20);
		BoxClassForBoxTower box3 = new BoxClassForBoxTower(30,30,30);
		BoxClassForBoxTower box4 = new BoxClassForBoxTower(40,40,40);
		
		TallestBoxTower tower = new TallestBoxTower();
		ArrayList<BoxClassForBoxTower> tallestTower = new ArrayList<BoxClassForBoxTower>();
		BoxClassForBoxTower [] boxes = {box1, box2, box3};
		tallestTower = tower.createBoxTower(boxes, box4);
		for(BoxClassForBoxTower box: tallestTower){
			System.out.println("Box is "+box.getDepth()+box.getHeight()+box.getWidth());
		}
		System.out.println("The height is "+tower.getHeight(tallestTower));
		
	}
}
