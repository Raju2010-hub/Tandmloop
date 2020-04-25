package com.java.test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=sc.nextInt();
		for(int i=1;i< Integer.MAX_VALUE && a > 0;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
				a--;
			}
		}
	}

}
