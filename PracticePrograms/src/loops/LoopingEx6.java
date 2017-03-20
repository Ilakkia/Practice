package loops;

public class LoopingEx6 {

	public static void main(String[] args) {
		/*
		 * 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 */

		int i,j,k;
		int n=5;
		for(i=1;i<=n;i++){
			for(j=i-1;j>=i;j++)
			{	
				System.out.print(" ");
			}
			for(k=5;k>=i;k--){
				System.out.print(k);
			}
			System.out.println();
		}
			
	}

}
