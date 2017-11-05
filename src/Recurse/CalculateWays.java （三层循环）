package Recurse;

public class CalculateWays {
	//final int CENT = 25;
	public final int DIMES = 10;
	public final int NIKELS = 5;
	public final int PENNIES = 1;
	
	public int getWays(int cents, int Ndimes, int Nnikels, int Npennies){
		int nWays = 0;
		for(int i=0; i<= Ndimes; i++){
			for(int j=0; j<=Nnikels; j++){
				for(int k=0; k<=Npennies; k++){
					if(i*DIMES+j*NIKELS+k*PENNIES == cents){
						System.out.println("is "+i+" "+j+" "+k);
						nWays++;
					}
				}
			}
		}
		return nWays;
	}
	
	public static void main(String [] args){
		int cents = 10;
		CalculateWays c = new CalculateWays();
		int Ndimes = cents/c.DIMES;
		int Nnikels = cents/c.NIKELS;
		int Npennies = cents/c.PENNIES;
		CalculateWays way = new CalculateWays();
		System.out.println(way.getWays(cents, Ndimes, Nnikels, Npennies));
	}
	
}
