package sort2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
 
public class Main{
    public static void main(String[] args) throws IOException {
   
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        
        Set<Integer> set = new TreeSet<>();
         
        for(int i=0; i<n; i++){
            int input = Integer.parseInt(bf.readLine());
            set.add(input);
        }
    
        for (Integer integer : set) {
			System.out.println(integer);
		}
    
    }
}