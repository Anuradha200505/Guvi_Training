package guvi;
import java.util.Scanner;
public class Primenumner {
	public static void main(String[] args) {
		int n;
		int count = 0;
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Enter your value");
		n = sca.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count+=1;
			}
		}
		
		if(count==2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("not a prime");
		}
	}

}
