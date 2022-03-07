package com.bridgelab;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[0];
        System.out.println(a.length);
        
        int[] a1 = new int[3];
        System.out.println("a[0] :" + a1[1]);
        
        double[] myArray = {10 ,55, 65, 75, 68, 10};
        double max = myArray[0];
        int indexOfMax = 0;
        
        for(int i = 1; i < myArray.length ; i++)
        {
            if(myArray[i]>max)
            {
                max = myArray[i];
                indexOfMax=i;
            }
        }
           System.out.println(indexOfMax);

	}

}
