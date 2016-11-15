package Fibonaci;
import java.util.Scanner;

public class Main {
	
	static int zero ;
	static int one ;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int T = s.nextInt();
		int[] N = new int[T];
		
		for (int i = 0; i < T; i++) {

			int B = s.nextInt();
			N[i]=B;
		
		}
		
		for (int i = 0; i < T; i++) {
			fibb(N[i]);
		}

	}
	public static int zerocount(){
		return zero++;
	}
	public static int onecount(){
		return one++;
	}
	
	public static void initCounter() {
		zero = 0;
		one = 0;
	}
	
	public static int fibb(int n){
		int result = fibonacci(n);
		System.out.println(zero+" "+one);
		initCounter();
		return result;
	}
	public static int fibonacci(int n) {


		if (n == 0) {
			zerocount();
			return 0;
		} else if (n == 1) {
			 onecount();
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
		
	}
	
}
