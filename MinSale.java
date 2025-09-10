package array;

public class MinSale {

	public static void main(String[] args) {
		int[] sales = {100,200,500,600};
		int minsale=Integer.MAX_VALUE;
		for(int i=0;i<sales.length;i++) {
			if(sales[i]<minsale) {
				minsale=sales[i];
			}
		}
		System.out.println("Minimum Sales : "+minsale);

	}

}
