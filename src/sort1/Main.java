package sort1;

import java.util.Arrays;
/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */
import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			int[] array = new int[n];

			for (int j = 0; j < n; j++)
				array[j] = sc.nextInt();

			Arrays.sort(array);

			int answer = 0;
			int max = 0;

			for (int j = 0; j < n; j++)
				if (array[j] + n - j > max)
					max = array[j] + n - j;

			for (int j = 0; j < n; j++)
				if (array[j] + n >= max)
					answer++;

			System.out.println("Case #" + (i + 1) + "\n" + answer);

		}

	}
}