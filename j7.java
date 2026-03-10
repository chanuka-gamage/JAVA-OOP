class Animal{
	void sound(){
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal{
	void bark(){
		System.out.println("Dog is barking");
	}
}

public class j7{
	public static void main(String [] args){
		Dog d = new Dog();
		d.sound();
		d.bark();
	}
}