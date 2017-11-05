package Recurse;

import java.util.ArrayList;

public class Robot {
	public boolean getPath(int x, int y, ArrayList<GridPoint> path){
		GridPoint point = new GridPoint(x, y);
		if(point.getPointX() == 0 && point.getPointY() == 0){
			System.out.println("get the end");
			return true;
		}
		boolean success = false;
		if(x-1>=0){
			success = getPath(x-1, y, path);
		}
		if(!success && y-1>=0){
			success = getPath(x, y-1, path);
		}
		if(success){
			path.add(point);
		}
		return success;
	}
	
	public static void main(String [] args){
		Robot robot = new Robot();
		ArrayList<GridPoint> path = new ArrayList<GridPoint>();
		robot.getPath(3, 3, path);
		for(GridPoint g: path){
			System.out.println("("+g.getPointX()+","+g.getPointY()+")");
		}
	}
}
