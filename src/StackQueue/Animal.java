package StackQueue;

public abstract class Animal {
	public int order;
	public String name;
	public Animal(){
		
	}
	public Animal(String _name, int _order){
		this.name = _name; 
		this.order = _order;
	}
	public int getOrder(){
		return this.order;
	}
	public boolean isOlder(Animal a){
		return this.getOrder()<a.getOrder();
	}
	public abstract void bark();
}
