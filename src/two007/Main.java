package two007;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[] array31 = { 1, 3, 5, 7, 8, 10, 12 };
		int[] array30 = { 4, 6, 9, 11 };
		int[] array28 = { 2 };

		int[] nMonthDay = new int[12 + 1];
		nMonthDay[0] = 0;

		for (int i = 0; i < array31.length; i++)
			nMonthDay[array31[i]] = 31;

		for (int i = 0; i < array30.length; i++)
			nMonthDay[array30[i]] = 30;

		for (int i = 0; i < array28.length; i++)
			nMonthDay[array28[i]] = 28;

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		int day = sc.nextInt();

		int total = 0;
		for (int i = 0; i < month; i++) {
			total += nMonthDay[i];
		}
		total += day;

		System.out.println(getDay(total));

	}

	public static String getDay(int total) {
		int result = total % 7;

		switch (result) {
		case 0:
			return "SUN";

		case 1:
			return "MON";
		case 2:
			return "TUE";

		case 3:
			return "WED";

		case 4:
			return "THU";

		case 5:
			return "FRI";

		case 6:
			return "SAT";

		default:
			break;
		}
		return "";

	}
}
