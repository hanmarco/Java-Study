package XOR;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			
			int ans = -1;
			
			for (int b = 2; b * b <= n; b++) {
				
				int num = n % b;
				
				int x = n;
				boolean ok = true;
				while (x > 0) {
					if (x % b != num) {
						ok = false;
						break;
					}
					x /= b;
				}
				
				if (ok) {
					ans = b;
					break;
				}
			}
			if (ans == -1) {
				for (int i = 1; i * i <= n; i++) {
					if (n % i != 0) {
						continue;
					}
					int x = i;
					int base = n / x - 1;
					if (base > x) {
						ans = base;
					}
				}
			}
			if (ans == -1) {
				ans = n + 1;
			}

			System.out.println("Case #" + tc);
			System.out.println(ans);
		}
	}

}
