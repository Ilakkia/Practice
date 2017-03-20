package loops;

public class LoopingEx3 {

	public static void main(String[] args) {
		int i,j,k;
		int n=5;
		for(i=1;i<=n;i++){
			for(j=n-i;j>=1;j--){
				System.out.print(" ");
			}
			for(k=j+i;k>=1;k--){
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
