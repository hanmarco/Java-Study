package countNum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] countNum = new int[10];
		
		String result = String.valueOf(A*B*C);
		
		
		countNum = counting(result);
		
		for (int i : countNum) 
			System.out.println(i);
		
	}
	
	public static int[] counting(String str) {
		int ZERO = '0';
		int[] countNum = new int[10];
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char t =str.charAt(i);
			countNum[t-ZERO]++;
		}
		
		return countNum;
	}
	
}
