package StackQueue;

import java.util.LinkedList;

public class AnimalQueue {
	LinkedList<Dog> dogs = new LinkedList<Dog> ();
	LinkedList<Cat> cats = new LinkedList<Cat> ();
	
	public void enqueue(Animal a){
		a.order++;
		if(a instanceof Cat){
			cats.addLast((Cat)a);
		}else if(a instanceof Dog){
			dogs.addLast((Dog)a);
		}
	}
	
	public Animal dequeue(){
		if(cats.size()==0){
			return dogs.poll();
		}else if(dogs.size()==0){
			return cats.poll();
		}else{
			Cat cat = cats.peek();
			Dog dog = dogs.peek();
			if(dog.isOlder(cat)){
				return dogs.poll();
			}else{
				return cats.poll();
			}
		}
	}
	
	public static void main(String [] args){
		AnimalQueue queue = new AnimalQueue();
		int timestep = 0;
		Cat cat = new Cat("OldCat",timestep);
		queue.enqueue(cat);
		timestep++;
		cat = new Cat("NewCat",timestep);
		queue.enqueue(cat);
		timestep++;
		timestep = 0;
		Dog dog = new Dog("OldDog",timestep);
		queue.enqueue(dog);
		timestep++;
		dog = new Dog("NewDog",timestep);
		queue.enqueue(dog);
		timestep++;
		
		queue.dequeue().bark();
		queue.dequeue().bark();
		queue.dequeue().bark();
		queue.dequeue().bark();
		
		
	}
}
