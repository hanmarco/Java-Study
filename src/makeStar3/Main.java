package makeStar3;

import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
		
			for (int j = 0; j < T-i; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}
