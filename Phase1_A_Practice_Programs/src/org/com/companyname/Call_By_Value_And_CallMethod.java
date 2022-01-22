package org.com.companyname;

public class Call_By_Value_And_CallMethod {

		int val=150;

		int operation(int val) {
			val =val*10/100;
			return(val);
		}

		public static void main(String args[]) {
			Call_By_Value_And_CallMethod d = new Call_By_Value_And_CallMethod();
			System.out.println("Before operation value of data is "+d.val);
			d.operation(100);
			System.out.println("After operation value of data is "+d.val);
			}
		}




