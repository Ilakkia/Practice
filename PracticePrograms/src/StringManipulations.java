

public class StringManipulations {
	public static void main(String args[]) {
		String str = "malayalamhfd";
		palindromesInString(str);
		//boolean res;
		// res = isPalindrome(str);
		// if (res == true)
		// if(isPalindrome(str))
		// System.out.println("Palindrome");
		// else
		// System.out.println("Not a Palindrome");


	}

	public static void palindromesInString(String str) {
		int count=0;
		String str1="";
		for (int i = 0; i <= str.length()-1; i++) {
			for (int j = str.length() - 1; j >i; j--) {
				str1=str.substring(i, j+1);
				if(isPalindrome(str1)){
					count++;
					System.out.println(str1);

				}
			}
		}
		System.out.println("Total Number of Palindromes:"+count);


	}

	public static boolean isPalindrome(String str) {
		boolean flag = false;
		int x = 0;
		int i;
		char ch[] = str.toCharArray();
		int num = str.length() - 1;
		for (i = num; i > num / 2; i--) {
			if (ch[x] == ch[i]) {
				flag = true;
				x++;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
