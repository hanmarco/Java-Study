package de;

import java.util.Vector;

public class Test {
	public static void main(String[] args) 
	{

		Vector<Integer> v = new Vector<>(5,5);
		
		
		v.add(10);
		funcc(v);
		v.add(10);
		funcc(v);
		v.add(10);
		funcc(v);
		v.add(10);
		funcc(v);
		v.add(10);
		funcc(v);
		v.add(10);
		funcc(v);
		v.add(10);
		funcc(v);
		v.add(10);
		funcc(v);
	}
	public static void funcc(Vector<Integer> v) {
		long start = System.currentTimeMillis();
		System.out.print("size: ");
		System.out.print(v.size());
		System.out.print(" ");
		System.out.print("capacity: ");
		System.out.print(v.capacity());
		long end = System.currentTimeMillis();
		long result = (end-start);
		System.out.print(" [time:");
		System.out.println(end);
		System.out.println("] ");
		
	}
	
	
}
