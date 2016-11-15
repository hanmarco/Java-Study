package goodNum;

import java.util.Collection;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();

		for (int TC = 0; TC < T; TC++) {
			int N = s.nextInt();
			int[] array = new int[N];

			// 수열 길이
			for (int j = 0; j < N; j++) {
				array[j] = s.nextInt();
			}

			int answer = 0;
			for (int i = array.length - 1; i >= 1; i--) {
				boolean isFind = false;

				for (int x = 0; x < i; x++){
					if (isFind)
						break;
					for (int y = x; y < i ; y++){
						if (isFind)
							break;
						for (int z =y; z < i; z++) {

							if (isFind)
								break;
							else {
								if (array[x] + array[y] + array[z] == array[i]) {
									
									isFind = true;
									break;
								}
							}

						}
					}
			}
				if (isFind)
					answer++;

			}
			
			System.out.println("Case #" + (TC+1));
			System.out.println(answer);
		} // for
	}// main

}// Class Main
