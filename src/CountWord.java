import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWord {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();

		input = removeBlankAtFront(input);
		
		String[] strList = input.split("[ ]{1,}");
		int result = strList.length;

		System.out.println(result);

		
	}
	
	public static String removeBlankAtFront(String input) {
		for (int i = 0; i < input.length(); i++) {
			String checksum = String.valueOf(input.charAt(i));

			if (" ".equals(checksum)) {
				continue;
			} else {
				input = input.substring(i, input.length());
				break;
			}
		}
		
		return input;
	}
}
