package guvi;

public class ClassAndObjects {
     int a,b,c;
	 ClassAndObjects(int a,int b)
	 {
		 this.a=a;
		 this.b=b;
	 }
	void add() {
		String s = "Local Variable";
		c = a+b;
		System.out.println("Sum : "+ c);
	}
		public static void main(String[] args) {
			ClassAndObjects obj1 = new ClassAndObjects(3,4);
			obj1.add();
			ClassAndObjects obj2 = new ClassAndObjects(8,4);
			obj2.add();
			
			
		}
		
	}
	