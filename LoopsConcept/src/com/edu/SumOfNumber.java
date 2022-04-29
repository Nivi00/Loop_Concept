package com.edu;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter your number");
		n=sc.nextInt();
		sc.close();
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(i%2==0) {
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
