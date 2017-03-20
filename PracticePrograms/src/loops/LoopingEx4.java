package loops;

public class LoopingEx4 {

	public static void main(String[] args) {
		/*
		 *    1
		 *    21
		 *    321
		 *    4321
		 *    321
		 *    21
		 *    1
		 */
		
		
		int i,j;
		int n=4;
		int count=0;
		
		for(i=1;i<=n;i++)
		{
			count++;
			int dec=count;
			for(j=1;j<i+1;j++){
				System.out.print(dec);
				dec--;
			}
			System.out.println();
		}
		
		for(i=n-1;i>=1;i--){
			count--;
			int dec=count;
			for(j=1;j<i+1;j++){
				System.out.print(dec);
				dec--;
			}
			System.out.println();
		}

	}

}
