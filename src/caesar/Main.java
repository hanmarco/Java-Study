package caesar;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        System.out.println(caesar(str));
    }
    public static String caesar(String str) {
		
    	String result = "";
        for (int i = 0; i < str.length(); i++) {
			
        	char charact = str.charAt(i);
        	int x = (charact-'A'-3+26)%26;
        	charact = (char) (x+'A');
			
			result += charact;
		}
        return result;
	}
}