package Recurse;

public class GridPoint {
	private int x;
	private int y;
	
	public GridPoint(int _x, int _y){
		this.x = _x;
		this.y = _y;
	}
	
	public int getPointX(){
		return this.x;
	}
	
	public int getPointY(){
		return this.y;
	}
	
	GridPoint getPoint(){
		return this;
	}
}
