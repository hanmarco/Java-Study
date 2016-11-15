package frog;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();

			int[] array = new int[n + 1];
			array[0] = 0;
			for (int j = 1; j < array.length; j++)
				array[j] = sc.nextInt();

			int k = sc.nextInt();
			int answer = 0;
			
			// solve(); 통과하면 그대로 0통과못하면 -1
			for (int j = 0; j < array.length - 1; j++) {
				
					if (array[j + 1] - array[j] > k) {
						System.out.println("Case #" + (i + 1) + "\n" + "-1");
						answer--;
						break;
					}
				
			}
			if (answer != -1) {
				int currentPoint = 0;

				for (int j = 0; j < array.length;) {
					if (j == array.length - 1) {
						break;
					}
					currentPoint = findnext(array, currentPoint, k);
					j = currentPoint;
					answer++;

				}
				// solve();
				System.out.println("Case #" + (i + 1) + "\n" + answer);
			}
		}

	}

	public static int findnext(int[] array, int current, int k) {
		int pointer = -1;
		for (int i = current + 1; i < array.length; i++) {
			if (array[i] - array[current] > k) {
				break;
			} else {
				pointer = i;
			}
		}
		return pointer;
	}
}
