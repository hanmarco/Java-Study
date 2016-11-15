package OXquiz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 0; testcase < T; testcase++) {
			String line = sc.next();
			int point = getPoint(line);
			System.out.println(point);
		}
	}

	public static int getPoint(String str) {

		String str2 = str.replace('O', '1');
		str2 = str2.replace('X', '0');
		int length = str2.length();
		int[] str3 = new int[length] ;
		
		for (int i = 0; i < length; i++) 
			str3[i] = str2.charAt(i)-'0';
		
		for (int i = 1; i < length; i++) 
			if(str3[i]>0)
				str3[i]=str3[i]+str3[i-1];
		
		int total = 0;
		for (int i : str3) 
			total += i;
		
		return total;
	}
}
