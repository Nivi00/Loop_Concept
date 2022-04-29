package com.edu;

import java.util.Scanner;

public class SumOfAlternateValues {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter your number");
		n=sc.nextInt();
		sc.close();
	
      float sum=0;
      for(int i=0;i<n;i++)
      {
    	  if(i%2==0)
    	  {
    		  sum=sum-i;
    	  }
    	  else
    	  {
    		  sum=sum+i;
    	  }
      }
      System.out.println(sum);
	}

}
