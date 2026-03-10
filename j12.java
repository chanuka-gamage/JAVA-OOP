abstract class Animal{
	abstract void sound();
	
	void sleep(){
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal{
	void sound(){
		System.out.println("Dog barks");
	}
}

public class j11{
	public static void main(String[] args){
		Dog obj=new Dog();
		obj.sleep();
		obj.sound();
	}
}