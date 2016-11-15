package ascii;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		
		int ascii = T.charAt(0);
		
		System.out.println(ascii);
		
	}
}
