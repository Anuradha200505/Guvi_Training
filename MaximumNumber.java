package array;

public class MaximumNumber {

	public static void main(String[] args) {
		int[] sales = {100,200,500,600};
		int maxsale=Integer.MIN_VALUE;
		for(int i=0;i<sales.length;i++) {
			if(sales[i]>maxsale) {
				maxsale=sales[i];
			}
		}
		System.out.println("Maximum Sales : "+maxsale);

	}

}
