package alphabet;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		int[] alphabet_index = new int[26];

		for (int i = 0; i < alphabet_index.length; i++) {
			alphabet_index[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {
			int distance = str.charAt(i) - 'a';
			
			if (alphabet_index[distance] == -1)
				alphabet_index[distance] = i;

		}

		for (int i = 0; i < alphabet_index.length; i++) {

			System.out.print(alphabet_index[i] + " ");
		}
		System.out.println("");

	}
}
