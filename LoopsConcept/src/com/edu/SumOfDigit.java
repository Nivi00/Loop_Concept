package com.edu;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter your number");
		n=sc.nextInt();
		sc.close();
		
		int count=0;
		int digit=0,sum=0;
		
	    while(n>0)
		   {
	    digit=n%10;
		sum=sum+digit;
		n=n/10;
		count=count+1;
		
		
	}
	System.out.println("sum is"+sum);
	System.out.println("count is"+count);
	
	}
}
