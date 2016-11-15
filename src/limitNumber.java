import java.util.Scanner;

public class limitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
	
		int result = counting(number);	
		System.out.println(result);
	}

	public static int[] seperate(int number) {
		String str = Integer.toString(number);
		
		int length = str.length();
		int[] array = new int[length];
		
		for (int i = 0; i < array.length; i++) {
			char c = str.charAt(i);
			int value = c-'0';
			array[i] = value;
		}
		
		return array;
	}
	
	public static int counting(int number) {
		int count = 0;
		
		for (int i = 1; i <= number; i++) {
			int[] array = seperate(i);
			if (isArithmeticSequence(array)) 
				count++;
		}
		return count;
	}
	
	
	public static boolean isArithmeticSequence(int[] sequence) {
		int d=0;

		for (int i = 0; i < sequence.length-1; i++) {
			int distance = sequence[i+1]-sequence[i];
		
			if (i==0)
				d = distance ;
			else {
				if(d!=distance)
					return false;
			}
		}
		
		return true;
	}
}
