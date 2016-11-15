package NHN;

import java.util.Scanner;

public class MAIN3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(rev(n));

	}

	public static int rev_number(int n) {
		String str = Integer.toString(n);
		char[] chr = str.toCharArray();
		int length = str.length();

		for (int i = 0; i < length / 2; i++) {
			char A = chr[i];
			char B = chr[length - 1 - i];

			chr[i] = B;
			chr[length - 1 - i] = A;
		}

		return Integer.parseInt(String.copyValueOf(chr));

	}

	public static int rev_plus(int n) {
		int rev_number = rev_number(n);
		
		if (n == rev_number)
			return rev_number;
		else
			return rev_number + n;

	}

	public static int rev(int n) {
		int result = n;

		for (int i = 0; i < 3; i++) 
			result = rev_plus(result);	

		if (result == rev_number(result))
			return result;
		else
			return -1;
	}
}

