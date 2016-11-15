package removeMatrix;

/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		/*
		 * 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다. 만약 본인의
		 * PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면, 표준입력 대신
		 * input.txt 파일로 부터 입력값을 읽어 올 수 있습니다. 또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을
		 * 사용하여 테스트하셔도 무방합니다. 단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나
		 * 주석(//) 처리 하셔야 합니다.
		 */
		// Scanner sc = new Scanner(new FileInputStream("input.txt"));

		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;

		TC = sc.nextInt();

		for (test_case = 1; test_case <= TC; test_case++) {
			// 이 부분에서 알고리즘 프로그램을 작성하십시오.
			int N = sc.nextInt();
			int[] array = new int[N];
			int[] result = new int[N];

			for (int i = 0; i < N; i++)
				array[i] = sc.nextInt();
			int count = 0;

			while (!isAllzero(array)) {

				for (int i = 0; i < N; i++) {
					if (i == 0 || i == N - 1)
						result[i] = 0;
					else {

						result[i] = minNumber(array[i - 1], array[i + 1], array[i] - 1);
					}
				}
				count++;
				System.arraycopy(result, 0, array, 0, N);
			}
			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(count);

		}
	}

	public static boolean isAllzero(int[] array) {
		boolean isAllzero = true;

		for (int i = 0; i < array.length; i++) {

			if (array[i] != 0) {
				isAllzero = false;
				break;
			}
		}
		return isAllzero;

	}

	public static int minNumber(int a, int b, int decrease) {
		int min = a;

		if (decrease < 0)
			decrease = 0;

		if (a > b)
			min = b;

		if (min > decrease)
			min = decrease;

		return min;
	}
}