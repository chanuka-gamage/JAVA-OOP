//private modification+user input+abstraction+getter setter(encapsulation) Combination 

/*#Private variables → data hiding
  #Getter & Setter → controlled access
  #User input → Scanner
  #Abstraction → using abstract class
*/
import java.util.Scanner;
//create abstract class
abstract class Student{
	
	//create abstraction method
	abstract void displayDetails();
	
	//create private variables(this many times uses data hiding)
	private String name;
	private int age;
	
	//Getter and setter 
	//name
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
	return name;
	}
	
	//age
	public  void setage(int age){
		if (age>0){ //see age true or false
			this.age=age;
	}
	}
	public int getage(){
		return age;
	}
	}
	
	
//Create sub classes
class CollegeStudent extends Student{
    //abstract method
	void displayDetails(){
		System.out.println("-----student Details--------");
		System.out.println("Name : "+getname());
		System.out.println("Age  :"+getage());
	}
}
		
//Main class with Get user inputs

public class Question1{
    public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	Student s=new CollegeStudent();
	
	//get input
	System.out.println("Enter your name:");
	String name=scan.nextLine();
	s.setname(name);
	
	System.out.println("Enter your Age :");
	int age=scan.nextInt();
	s.setage(age);
	
	s.displayDetails();
	
	scan.close();
	}
}

	/*1.create abstract class
	  2.get private variables
	  3.create abstract method
	  4.setter getter one by one variables
	  5.create subclass
	  6.create main calss
	  7.get user input
	  8.print abstract method
	  */