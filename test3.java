package com.java.test;

import java.util.Scanner;

public class test3 {

		public static void main(String[] args) {
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			a=sc.nextInt();
			if(a%2==0)
				a=a-1;
			for(int i=1;i< Integer.MAX_VALUE && a > 0;i++) {
				if(i%2==1) {
					System.out.print(i+" ");
					a--;
				}
			}
		}

}
