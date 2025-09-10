package array;

public class Derived1 extends Base1{
	int b,total;
	Derived1(int a, int b){
		super(a);
		System.out.println("Inside Derived Constructor");
		this.b=b;
		}
	public void sum() {
		total=a+b;
		System.out.println("Total = "+ total);
	}
 public static void main(String[] args) {
	 Derived1 obj1 = new Derived1(3,5);
	 obj1.sum();
	 
 }
}
