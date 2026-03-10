class Animal{
	void sound(){
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	//@override
	void sound(){
		System.out.println("Dog barks");
	}
}
public class j8{
	public static void main(String[] args){
		Animal obj=new Dog();
		obj.sound();
	}
}
	