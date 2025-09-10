package array;

public class CountEvenNumbers {
	public static void main(String[] args) {
		int count=0;
		int odd=0;
		int[] Number = {12,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<Number.length;i++) {
			if(Number[i]%2==0) {
				count+=1;
			}
			else {
				odd+=1;
			}
			
		}
		System.out.println("Even Count : "+ count);
		System.out.println("Odd Count : "+ odd);
	}

}
