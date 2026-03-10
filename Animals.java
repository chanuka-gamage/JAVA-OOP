class Animals{
	String name;
	public void eat(){
		System.out.println("I can eat");
	}
}
class Dog extends Animals{
	public void display(){
		System.out.println("my name is"+name);
	}
}
 public class Main{
	public static void main(String[] args){
		Dog obj= new Dog();
		obj.name="Shadow";
		obj.display();
		obj.eat();
	}
}
		