import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
 
        int[] array = new int[3];
 
        array[0] = 0;
        array[1] = 1;
        array[2] = 3;
        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                array[0] = array[1];
                array[1] = array[2];
                array[2] = (array[1] + 2 * array[0]) % 10007;
 
            }
             
            System.out.println(array[2]);
        }
        else
            System.out.println(array[n]);
 
    }
}