package makeone;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int limit = (int) Math.pow(10, 6) + 1;

		int n = s.nextInt();
		int length = (n|4)+1;
		int[] array = new int[length];
//		System.out.println(n);
		
		array[0] = 0;
		array[1] = 0;
		array[2] = 1;
		array[3] = 1;

		for (int i = 4; i <= n; i++) {
			if (i % 3 == 0) {
				array[i] = 1 + Math.min(array[i / 3], array[i - 1]);
			} else if (i % 2 == 0) {
				array[i] = 1 + Math.min(array[i / 2], array[i - 1]);
			} else {
				array[i] = 1 + array[i - 1];
			}

		}
		System.out.println(array[n]);
	}

}
