package guvi;
import java.util.Scanner;
public class ReversePattern {
	public static void main(String[] args) {
		int n;
		int x=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x-- + " ");
			}
			System.out.println("");
			
			}
				
		}
	
}
