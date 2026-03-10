class student{
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
}

public class j10{
	public static void main(String[]args){
		student obj=new student();
		
		obj.setName("Chanuka");
		System.out.println(obj.getName());
	}
}
