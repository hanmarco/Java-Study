package NHN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] stringArray = string.split(" ");

		ArrayList<Integer> listArray = new ArrayList<Integer>();
		
		Arrays.sort(stringArray);
		Queue<String> queue = new LinkedList();

		for (int number = 1 ; number<= 9 ; number++)
			{
				int i=0;
				
				while(true){
					String intt = Integer.toString(i);
					if(stringArray[i].charAt(0))
						
						
				}
			}


	}

	public static int sortIncrese() {

	}

}
