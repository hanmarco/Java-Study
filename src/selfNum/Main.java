package selfNum;

public class Main {
	public static void main(String[] args) {

	
	
		 
		    int i,j,k;  
		    int pwd;
		    int[] arr = new int[10001]; //self-number들을 배열에 넣을 것.
		 
		    for (i = 1; i < 10001; i++) {
		        
		    	if ((0 < i) && (i < 10))     
		            arr[i] = i + i;
		        
		        else if ((9 < i) && (i < 100)) 
		            arr[i] = i + (i / 10) + (i % 10);   
		        
		        else if ((99 < i) && (i < 1000)) 
		            arr[i] = i + (i / 100) + ((i % 100) / 10) + (i % 10); 
		        
		        else if ((999 < i) && (i < 9999)) 
		            arr[i] = i + (i / 1000) + ((i % 1000) / 100) + ((i % 100) / 10) + (i % 10); 
		        
		    }
		 
		    for (j = 1; j < 10001; j++) {
		        pwd = 0;    
		        for (k = 1; k < 10001; k++) {
		            if (j == arr[k]) {  
		                pwd++;          
		            }
		        }
		        if (pwd == 0) {         
		           System.out.println(j);
		        }       
		    }
		 
		 
		 
		     
		}

}
