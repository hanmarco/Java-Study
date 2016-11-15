package NHN;

import java.util.Scanner;

//toast standard bank display book
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String buffer = sc.nextLine();
		String[] STRs = buffer.split(" ");

		int ddouble = 0;
		int ttriple = 0;
		String doubleRegex = "[A-Za-z0-9_]*[aeiou]{2}[A-Za-z0-9_]*";
		String tripleRegex = "[A-Za-z0-9_]*[^aeiou]{3}[A-Za-z0-9_]*";

		for (String string : STRs) 			
			if (string.matches(doubleRegex)) 
				ddouble++;

			else if (string.matches(tripleRegex)) 
				ttriple++;
		
		System.out.println(ddouble + "\n" + ttriple);
	}
}
