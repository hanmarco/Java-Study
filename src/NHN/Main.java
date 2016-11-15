package NHN;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String buffer = sc.nextLine();
		String[] strs = buffer.split(" ");
		int[] ints = new int[strs.length];

		for (int i = 0; i < strs.length; i++)
			ints[i] = Integer.parseInt(strs[i]);

		Arrays.sort(ints);

		int result = getMinDistIndex(ints);

		System.out.println(ints[result] + " " + ints[result + 1]);
	}

	public static int getMinDistIndex(int[] ints) {
		int mindistance = Integer.MAX_VALUE;
		int mindist_index = Integer.MAX_VALUE;

		for (int i = 0; i < ints.length - 1; i++) {
			int result = ints[i + 1] - ints[i];
			if (result < mindistance) {
				mindist_index = i;
				mindistance = result;
			} else if (result == mindistance) {
				continue;
			}
		}
		
		return mindist_index;
	}
}
