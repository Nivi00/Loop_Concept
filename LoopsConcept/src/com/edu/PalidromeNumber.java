package com.edu;

import java.util.Scanner;

public class PalidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
      int n;
      
      System.out.println("Enter your number");
      n=sc.nextInt();
      sc.close();
      
      int temp=n;
      int digit=0,sum=0,rev=0;
      
      while(n>0)
      {
    	  digit=n%10;
    	  rev=rev*10+digit;
    	  sum=sum+digit;
    	  n=n/10;
      }
      System.out.println(rev);
      if(temp==rev)
      {
   System.out.println("It is palidrome number");
   
	}
	else {
		System.out.println("It is not palidrome number");
	}
}
}
