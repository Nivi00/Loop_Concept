package com.edu;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
        int n;
		System.out.println("Enter your number");
		n=sc.nextInt();
		sc.close();
		
		
		int sum=0;
		int fact=1;
		 
		for(int i=0;i<=n;i++)
		{
			fact=1;
	    for(int j=1;j<=i;j++)
	    {
	    	sum=sum+(fact*1);
	    	
	    }
                   
		}
		System.out.println(sum);
	}
	

}
