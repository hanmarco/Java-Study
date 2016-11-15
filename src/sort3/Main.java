package sort3;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> set = new TreeSet<>();

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int testcase = 0; testcase < N; testcase++) {

			pq.add(sc.nextInt());
		}

		for (Integer integer : pq) {
			System.out.println(integer);
		}

	}
}
