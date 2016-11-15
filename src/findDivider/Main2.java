package findDivider;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		move(T-1);

	}

	public static void move( int T) {
		int count = 0;
		int i = 0;
		
		for (i = 1; count + i < T; i++) 
			count += i;
		
		int distance = T - count;
		
		boolean isEven = (i % 2 == 0);
		Point point;
		if (isEven)
			point = new Point(1, i);
		else
			point = new Point(i, 1);

		for (int j = 0; j < distance; j++) 
		{
			if (isEven) {
				if (point.isGoLeft())
					point.goLeft();
				point.goDown();
			} else {
				point.goRight();
				if (point.isGoUp())
					point.goUp();
			}
		}
		System.out.println(point.printt());	
	}
}

class Point {
	int row;
	int column;

	public Point(int x, int y) {
		row = x;
		column = y;
	}

	public boolean goLeft() {
		if (column > 1) {
			column--;
			return true;
		}
		return false;
	}

	public boolean goUp() {
		if (row > 1) {
			row--;
			return true;
		}
		return false;
	}

	public void goRight() {
		column++;
	}

	public void goDown() {
		row++;
	}

	public boolean isGoLeft() {
		if (column > 1)
			return true;

		return false;
	}

	public boolean isGoUp() {
		if (row > 1)
			return true;

		return false;
	}

	public String printt() {
		return row + "/" + column;
	}
}