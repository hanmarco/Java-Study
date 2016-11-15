package fibo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		
		int limit = (int) Math.pow(10, 6)+1;
		
		int n = s.nextInt();
		int[] array = new int[n%limit];
		
		int x = s.nextInt();
		int result = 0;

		
		System.out.println(result);
	}

}
