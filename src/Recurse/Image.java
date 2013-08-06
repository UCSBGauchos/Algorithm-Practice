package Recurse;

public class Image {
	enum Color{
		Black, White, Red, Yellow, Green
	}
	
	public boolean paintFill(Color [][] pixels, int x, int y, Color oldColor, Color newColor){
		if(x<0 || y<0 || x>=pixels.length || y>=pixels.length){
			return false;
		}
		if(pixels[x][y] == oldColor){
			pixels[x][y] = newColor;
			paintFill(pixels, x-1, y, oldColor, newColor);
			paintFill(pixels, x+1, y, oldColor, newColor);
			paintFill(pixels, x, y-1, oldColor, newColor);
			paintFill(pixels, x, y+1, oldColor, newColor);
		}
		return true;
	}
}
