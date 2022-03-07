package com.bridgelab;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
	            {1, 2, 3}, 
	            {4, 5, 6, 9}, 
	            {7}, 
	        };
	      
	        
	        System.out.println("Length of row 1: " + a[0].length);
	        System.out.println("Length of row 2: " + a[1].length);
	        System.out.println("Length of row 3: " + a[2].length);
	        
	        for (int i = 0; i < a.length; ++i) {
	            for(int j = 0; j < a[i].length; ++j) {
	                System.out.println(a[i][j]);
	            }
	        }

	}

}
