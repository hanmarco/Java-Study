package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		Integer[] array = new Integer[T];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=i+1;
		}
		
		
		
		Collections.shuffle(Arrays.asList(array));
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
