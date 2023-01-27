package com.practice;

import java.util.Random;
import java.util.Scanner;

public class ATM_Machine {
  
	static int balence=10000;
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			    System.out.println("Automated Teller Machine");  
	            System.out.println("Choose 1 for Withdraw");  
	            System.out.println("Choose 2 for Deposit");  
	            System.out.println("Choose 3 for Check Balance");  
	            System.out.println("Choose 4 for EXIT");  
	            System.out.print("Choose the operation you want to perform:");
	            int n=scan.nextInt();
	            int amount=0;
	            switch(n)
	            {
	            case 1:System.out.println("enter the amount");
	                   amount=scan.nextInt();
	            	   withdraw(amount);
	            	   break;
	            case 2:System.out.println("enter the amount");
                       amount=scan.nextInt();
                       deposite(amount);
                       break;
	            case 3:System.out.println("your balence ="+balence);
	            	   break;
	            default:System.out.println("Thankyou wisit again");
	            	System.exit(0);
	            }
		}
		
	}
	public static void withdraw(int amount)
	{
		if(balence>=amount)
		{
			System.out.println("collect your money");
			balence-=amount;
	
		}
		else
		{
			System.out.println("account balence is low please deposit money");
		}
		
	}
	public static void deposite(int amount)
	{
		balence+=amount;
		System.out.println("amount deposited your balence is ="+balence);
	}
	

}
