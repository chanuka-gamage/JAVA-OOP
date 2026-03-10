// class vs method different

class Student{   //Class
	int id;//instance variable
	String name;
	
	//Default constructor
	Student(){
		id=0;
		name="Unknown";
	}
		
	
	void display(){   //Method
		System.out.println(id+" "+name);
	}
}

public class Main{
	public static void main(String[] args){
		Student s1 =new Student();  //object
		
	}
}


//Static keyword

*shared by all objects of class
*memory is allocated oonly once
*can be accessed without creating an object 

//*static variable 
 class student {
static String School="ABC School";
int id;
String name;


//*static method
class Calculator{
static int add(int a,int b){
	return a+b;
	
	int result=Calculator.add(5,3);
	
	
	//main is static
	public static void main(String[] args) 
	
	
//*static nested class 
class outer{
static int x=10;

static class Inner{ //static nested class  
void display(){	
	
	
//java array
	
	//Declaration 
	dataType[] arrayName;  or dataType arrayname[];
	
	ex:  numbers[0]=10;
         int numbers[0]=10;
         String name[]={"chanuka","Nimmal","Kamal"};		 
	
	*
	
	//object array
	
	
	//Using the constructors
    int []arr;
	add array: arr=new int []{1,2,3};
	
	student[] arr=new student[2];
	arr[0]=new student(101,"Jhon");
	arr[1]=new student (102,"Alex");
	
	//Using a separate member method
	student [] arr;
	arr=new student[2];
	
    arr[0]=new student();
	arr[1]=new student();
	
	arr[0].setData(101,"jhon");
	arr[1].setData(102."Alex");
	
	//Using an array initializer syntax
	student[] students={
		new student(101,"jhon"),
		new student(102,"Alex")
	};
    	