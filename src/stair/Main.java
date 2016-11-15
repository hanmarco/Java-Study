package stair;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		int[] ns = new int[111];
		int[] d = new int[111111];
		int n, k;
		
		n = s.nextInt();
		k = s.nextInt();
		
		
		    for (int i = 1; i <= n; i++)
		    	ns[i] = s.nextInt();
		 
		    d[0] = 1;
		    
		    for (int i = 1; i <= n; i++)
		    {
		        for (int j = ns[i]; j <= k; j++)
		            d[j] += d[j - ns[i]];
		    }
		    System.out.println(d[k]);
		    
	}
}
