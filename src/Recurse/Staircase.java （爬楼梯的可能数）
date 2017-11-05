package Recurse;

public class Staircase {
	public int countWays(int nSteps){
		if(nSteps<0){
			return 0;
		}
		//one method to get to nSteps
		if(nSteps == 0){
			return 1;
		}
		return countWays(nSteps-1) + countWays(nSteps-2) + countWays(nSteps-3);
	}
	
	public static void main(String [] args){
		int nSteps = 5;
		Staircase stair = new Staircase();
		System.out.println(stair.countWays(nSteps));
	}
}
