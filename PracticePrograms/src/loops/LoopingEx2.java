package loops;

public class LoopingEx2 {

	public static void main(String[] args) {
		int i,j;
		int n=5;
		int count=1;
		for(i=1;i<=n;i++){
			for(j=1;j<i+1;j++){
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}
