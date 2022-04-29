package com.edu;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		sc.close();
		
		int sqr=(n*n);
		int digit=0,sum=0;
		
	    while(sqr>0)
		   {
	    digit=sqr%10;
		sum=sum+digit;
		sqr=sqr/10;
		
	}
	
	System.out.println(sum);
       
      if (n==sum)
       {
    	   System.out.println("It is  neon number");
       }
       else
       {
    	   System.out.println("It is not neon number");
       }
	}
}
