package stackSeq;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		for (int testcase = 0; testcase < T; testcase++) {
			queue.add(sc.nextInt());
		}

		
		
		Stack<Integer> stack = new Stack();
		
	}
}
