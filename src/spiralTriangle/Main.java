package spiralTriangle;

import java.util.Scanner;

public class Main {

	static long[] dp = new long[101];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int[] n = new int[T];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;

		for (int i = 0; i < T; i++) {
			n[i] = sc.nextInt();
			for (int j = 6; j <= n[i]; j++) {
				dp[j] = dp[j - 5] + dp[j - 1];
			}

		}

		for (int i = 0; i < T; i++) {
			System.out.println(dp[n[i]]);
		}

	}


}
