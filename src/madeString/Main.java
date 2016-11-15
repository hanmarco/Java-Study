package madeString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 1<T<1000

		for (int testcase = 0; testcase < T; testcase++) {
			int n = sc.nextInt(); // n<8
			String str = sc.next(); // 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./:

			String result = operation(n, str);
			System.out.println(result);

		} // testcase for loop

	}

	public static String operation(int n, String str) {
		String result="";		
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			for (int j = 0; j < n; j++) 
				result = result+String.valueOf(c);	
			
		}
		return result;
	}
}
