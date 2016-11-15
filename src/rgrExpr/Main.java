package rgrExpr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String Line = sc.next();
		String bomb = sc.next();

		while (Line.contains(bomb)&&Line.length()>0) {
			Line = Line.replaceAll(bomb, "");
		}
		if (Line.length() == 0)
			System.out.println("FRULA");
		else
			System.out.println(Line);
	}
}
