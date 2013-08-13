package Recurse;

import java.util.ArrayList;

public class PeopleTower {
	public ArrayList<People> PeopleTower(ArrayList<People> list, People bottom){
		ArrayList<People> previousTower = null;
		int maxHeight = 0;
		
		for(People people: list){
			ArrayList<People> currentTower = new ArrayList<People>();
			if(bottom == null){
				currentTower = PeopleTower(list, people); 
			}else if(canBeAbove(people, bottom)){
				currentTower = PeopleTower(list, people); 
			}
			if(getHeight(currentTower)>maxHeight){
				maxHeight = getHeight(currentTower);
				previousTower = currentTower;
			}
		}
		if(previousTower == null){
			previousTower = new ArrayList<People>();
		}
		if(bottom != null){
			previousTower.add(bottom);
		}
		
		return previousTower;
	}
	
	public boolean canBeAbove(People top, People bot){
		if(top.height<bot.height&&top.weight<bot.weight){
			return true;
		}else{
			return false;
		}
	}
	
	public int getHeight(ArrayList<People> peopleList){
		int height = 0;
		for(People p: peopleList){
			height += p.height;
		}
		return height;
	}
	
	public static void main(String [] args){
		People p1 = new People(1,1);
		People p2 = new People(2,2);
		People p3 = new People(3,3);
		PeopleTower tower = new PeopleTower();
		ArrayList<People> list = new ArrayList<People>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		ArrayList<People> result = tower.PeopleTower(list, null);
		System.out.println(result.size());
		for(People p: result){
			System.out.println(p.height);
		}
	}
}
