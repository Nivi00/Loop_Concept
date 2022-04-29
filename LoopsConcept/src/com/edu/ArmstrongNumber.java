package com.edu;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
    System.out.println("Enter your number");
    n=sc.nextInt();
    sc.close();
    int temp=n;
    int digit=0, sum=0, res=0, output=0;
     
    while(n>0)
    {
    	digit=n%10;
    	res=(digit*digit*digit);
    	output=output+res;
    	sum=sum+digit;
    	n=n/10;
    }
    System.out.println(output);
    
    if(temp==output)
    	
    {
    	System.out.println("It is armstrong");
    }
    else
    {
    	System.out.println("It is not armstrong");
    }


	}

}
