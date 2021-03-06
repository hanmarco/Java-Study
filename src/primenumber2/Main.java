package primenumber2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			
			if(isPrime(t))
				count ++;
		}
		System.out.println(count);
		
	}
	
	public static boolean isPrime(int n) {
		if(n == 1)
			return false;
		
		for (int i = 2;	i < n; i++) {
			if(n%i==0)
				return false;
		}
		
		return true;
	}
}
