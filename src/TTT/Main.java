package TTT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		int[] array = { 5, 32, 1, 15, 55, 22, 66, 98 };

		for (int i : array)
			queue.add(i);

		

		reverse(queue);

		printQ(queue);
	}

	public static void printQ(Queue<Integer> queue) {
		while (!queue.isEmpty())
			System.out.println(queue.poll());
	}

	public static void reverse(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		stack.addAll(queue);

		queue.clear();

		while (!stack.isEmpty())
			queue.add(stack.pop());
	}
}
