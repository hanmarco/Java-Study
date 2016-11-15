package beeHouse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(func(sc.nextInt()));
		
	}
	public static int func(int T) {
		int destination = 1;
		
		int depth=1;
		
		for (int i = 1; destination < T;i++) {
			destination += 6*i-6;
			depth=i;
		}
		
		return depth;
	}
}
