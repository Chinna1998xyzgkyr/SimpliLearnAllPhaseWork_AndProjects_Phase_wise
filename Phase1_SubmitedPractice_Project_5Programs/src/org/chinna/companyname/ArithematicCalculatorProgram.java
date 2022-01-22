package org.chinna.companyname;
	import java.util.Scanner;

	public class ArithematicCalculatorProgram {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("eneter the two numbers");
			int firstnum=sc.nextInt();
			int secnum= sc.nextInt();
			System.out.println("Enter the operator ");
			char operator=sc.next().charAt(0);
			double result=0;

			switch(operator){
			case '+': result=firstnum+secnum;
			break;
			case '-':result=firstnum-secnum;
			break;
			case '*': result=firstnum*secnum;
			break;
			case '/':result=firstnum/secnum;
			break;
			}
			System.out.println("the answer is " +result);
		}
	}


