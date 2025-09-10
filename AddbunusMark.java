package array;

public class AddbunusMark {

	public static void main(String[] args) {
		int[] mark = {95,86,71,100};
		for(int i=0;i<mark.length;i++) {
			mark[i]=Math.min(100, mark[i]+5);
		}
		System.out.println("AFTER Adding 5 bUNUS MARK");
		for(int i:mark) {
			System.out.println(i);
		}
	}

}
