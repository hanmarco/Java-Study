package FriendlyBinary;

import java.util.Scanner;

public class Main {
	static long[] fiboArray = new long[91];
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		fiboArray[0]=0;
		fiboArray[1]=1;
		fiboArray[2]=1;
		fibo(n);
		System.out.println(fiboArray[n]);
		
	}
	
	
	public static long fibo(int n) {
		//피보나치 수 
		if (fiboArray[n]>1){
			return fiboArray[n];
		}
		else{
			for (int i = 3; i <= n; i++) {
				fiboArray[i]= fibo(i-1)+fibo(i-2);
			}
			return fiboArray[n];
		} 
	}
}