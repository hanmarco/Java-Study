package Book;

import java.util.Scanner;

public class Book{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N=0;
        N = s.nextInt();
        
        for(int i = 0  ; i < N; i++)
        {
            System.out.println((i+1));
        }
        
    }
}