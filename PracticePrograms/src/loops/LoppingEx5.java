package loops;

public class LoppingEx5 {
	/*
	 * 
	 */
	public static void main(String[] args) {
		int i, j, k;
		int n = 5;
		int count = 0;
		for (i = 1; i <= n; i++) {
			count = count + i;
			for (j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			int dec = count;
			for (k = i; k >= 1; k--) {
				System.out.print(dec);
				dec--;
			}
			System.out.println();
		}


	}

}
