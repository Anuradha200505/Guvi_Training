package array;

public class SecondLargestArray {
	public static void main(String[] args) {
		int[] num= {2,4,1,6,3,2,56,8,9,23};
		int firstlargest= Integer.MIN_VALUE;
		int secondlargest= Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++)  {
			
	if(num[i]>firstlargest){
		secondlargest=firstlargest;
		firstlargest=num[i];
	}
	else if(num[i]>secondlargest && num[i]!=firstlargest) {
		secondlargest=num[i];
	}
		
	}
		System.out.println("Second largest : "+ secondlargest);}

}
