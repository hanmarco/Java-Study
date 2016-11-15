package grader;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		System.out.println(operation(point));
	}

	public static String operation(int point) {

		if (point < 60)
			return "F";
		else if (point<70)
			return "D";
		else if (point<80)
			return "C";	
		else if (point<90)
			return "B";
		else
			return "A";
		

	}
}
