class Add{
	int sum(int a,int b){
		return a+b;
	}
    int sum(int a, int b, int c){
		return a+b+c;
	}
}
public class j9{
	public static void main(String[] args){
		Add obj=new Add();
	System.out.println(obj.sum(2,3));
	System.out.println(obj.sum(2,3,4));
    }
}

		