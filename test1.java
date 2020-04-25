package com.java.test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		double a;
		double b;
		String operation;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		 System.out.print("Enter an operator (+, -, *, /): ");
		 op = sc.next().charAt(0);
	      switch(op) {
	         case '+': operation = String.valueOf(a + b);
	            break;
	         case '-': operation = String.valueOf(a - b);;
	            break;
	         case '*': operation = String.valueOf(a * b);;
	            break;
	         case '/': operation = String.valueOf(a /b);;
	            break;
	         default:  System.out.printf(" Enter correct operator");
	            return;
	      }
	      System.out.print("The result is given as follows:\n");
	      System.out.printf(a + " " + op + " " + b + " = " + operation);
	      
	   }
		

	}


