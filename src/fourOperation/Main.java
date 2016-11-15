package fourOperation;

public class Main {

	public static void main(String[] args) {
		
		double[] array = { 1, 234, 444, 40, 9, 222, 231, 223,Integer.MAX_VALUE };

		double max = array[0];
		for (int i = 1; i < array.length; i++) {

			double average = (max + array[i]) / 2;
			
			double distance = Math.abs((average - max));
			Math.sqrt(4);
			
			max = distance+average;
		}
		System.out.println(max);
		
		
	}
}