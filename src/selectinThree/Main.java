package selectinThree;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] three = {A,B,C};
		
		Arrays.sort(three);
		
		System.out.println(three[1]);
	}
}
