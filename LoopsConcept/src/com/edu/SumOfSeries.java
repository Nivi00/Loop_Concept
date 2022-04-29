package com.edu;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter your number");
		n=sc.nextInt();
		sc.close();
	
      float sum=0;
      for(int i=0;i<n;i++)
      {
    	  sum=sum+((float)1/(i+1));
    	  
      }
      System.out.println(sum);
}
}
