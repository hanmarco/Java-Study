package maze;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int column = sc.nextInt();
		if (row < 2)
			row = 2;
		if (column > 100)
			column = 101;

		int[][] maze = new int[row][column];

		Queue<Nodd> queue = new LinkedList<Nodd>();

		for (int i = 0; i < row; i++) {
			String s = sc.next();
			char[] temp = s.toCharArray();

			for (int j = 0; j < column; j++) {
				maze[i][j] = temp[j] - '0';
			}
		}

		Nodd temp = new Nodd(0, 0, 1);

		maze[0][0] = 0;

		queue.add(temp);
		Nodd currentNode = null;

		while (!queue.isEmpty()) {
			currentNode = queue.poll();
			int x = currentNode.x;
			int y = currentNode.y;
			int cost = currentNode.cost;

			if (x == row - 1 && y == column - 1)
				break;

			if (x - 1 >= 0)// 위가 있을때
			{

				if (maze[x - 1][y] == 1) // 갈수있는 곳이면
				{
					queue.add(new Nodd(x - 1, y, cost + 1));
					maze[x - 1][y] = 0;
				}
			} // 오른쪽이 있을때
			if (y + 1 < column) {

				if (maze[x][y + 1] == 1) // 갈수있는 곳이면
				{
					queue.add(new Nodd(x, y + 1, cost + 1));
					maze[x][y + 1] = 0;
				}

			}
			if (x + 1 < row)// 아래쪽이 있을 때
			{
				if (maze[x + 1][y] == 1) // 갈수있는 곳이면
				{
					maze[x + 1][y] = 0;
					queue.add(new Nodd(x + 1, y, cost + 1));
				}
			}
			if (y - 1 >= 0)// 왼쪽이 있을때
			{

				if (maze[x][y - 1] == 1) { // 갈수있는 곳이면
					queue.add(new Nodd(x, y - 1, cost + 1));
					maze[x][y-1] = 0;
				}
			}

		}
		System.out.println(currentNode.cost);

	}
}

class Nodd {
	int x;
	int y;
	int cost;

	public Nodd(int xx, int yy, int cost) {
		x = xx;
		y = yy;
		this.cost = cost;
	}
}
