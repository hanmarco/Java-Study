package primenumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean[] matrix = new boolean[1000001];
		
		Arrays.fill(matrix, true);
		matrix[0]=matrix[1]=false;
		
		func(2,matrix);
		func(3,matrix);
		func(5,matrix);
		func(7,matrix);
		
		for (int i = 11; i < 100; i++) {
			if (matrix[i]==true)
				func(i,matrix);
		}
		
		for (int i = 101; i < 10000; i++) {
			if (matrix[i]==true)
				func(i,matrix);
		}
		for (int i = 10001; i < 1000000; i++) {
			if (matrix[i]==true)
				func(i,matrix);
		}
		print(A,B,matrix); 
		
	}
	
	public static void func(int n, boolean[] matrix) {
		for (int i = n; i < 1000000; i= i+n) {
			if(i==n)
				continue;
			else
				matrix[i]=false;
			
		}
	}
	public static void print(int A, int B,boolean[] matrix) {
		for (int i = A; i <= B; i++) {
			if(matrix[i]==true)
				System.out.println(i);
		}
	}
}
