package Summary;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int result = T*(1+T)/2;
		System.out.println(result);
	}
}
