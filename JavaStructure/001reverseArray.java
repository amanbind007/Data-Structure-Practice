/*package whatever //do not write package name here */

import java.util.*;


class GFG {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(int i = 0; i < t; i++){
		    int n = s.nextInt();
		    
		    int[] a = new int[n];
		    
		    for(int j = 0; j < n; j++){
		        a[j] = s.nextInt();
		    }
		    
		    for(int j = 0; j< Math.floor(n/2); j++){
		        
		        int temp = a[j];
		        a[j] = a[n-j-1];
		        a[n-j-1] = temp;
		      
		    }
		    
		    for(int j = 0; j < n; j++){
		        System.out.print(a[j]+ " ");
		    }
		    
		}
		
		
	}
}