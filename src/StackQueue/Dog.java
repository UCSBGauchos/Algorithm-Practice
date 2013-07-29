package StackQueue;

public class Dog extends Animal{
	public Dog(String _name, int _order){
		this.name = _name;
		this.order = _order;
	}
	public void bark(){
		System.out.println("I am "+name+" The timestamp is "+order);
	}
}
