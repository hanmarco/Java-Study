package RGBStreet;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][] matrix = new int[N][3];
		int[][] cost = new int[N][3];

		for (int i = 0; i < N; i++)
			for (int j = 0; j < 3; j++)
				matrix[i][j] = s.nextInt();

		cost[0][0] = matrix[0][0];
		cost[0][1] = matrix[0][1];
		cost[0][2] = matrix[0][2];

		for (int i = 1; i < matrix.length; i++) {

			for (int j = 0; j < 3; j++) {
				
				int little = Integer.MAX_VALUE;
				
				for (int k = 0; k < 3; k++) {
					if (j == k)
						continue;
					else {
						if(cost[i-1][k]<little)
							little = cost[i-1][k];
					}
					
				}
				cost[i][j] = matrix[i][j] + little;
				
			}
		}
		int best = Integer.MAX_VALUE;
		
		for (int i = 0; i < 3; i++) {
			if(best>cost[matrix.length-1][i])
				best=cost[matrix.length-1][i];
		}
		
		System.out.print(best);
		
	}
}
