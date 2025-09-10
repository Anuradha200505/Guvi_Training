package array;

public class OverLoading {
	void display() {
		System.out.println("Hello");
	}
	void display(String name) {
		System.out.println("Hello "+name);
	}
	void display(int a, int b) {
		System.out.println("Product="+a*b);
	}
 public static void main(String[] args) {
	 OverLoading obj = new OverLoading();
	 obj.display();
	 obj.display("Anu");
	 obj.display(4,5);
	 
 }
}
