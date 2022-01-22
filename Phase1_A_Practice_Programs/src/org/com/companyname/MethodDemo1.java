package org.com.companyname;

public class MethodDemo1 {

		public int multipynumbers(int a,int b) {
			int z=a/b;
			return z;
		}

		public static void main(String[] args) {

			MethodDemo1 b=new MethodDemo1();
			int result= b.multipynumbers(5,25);
			System.out.println("Multipilcation is :"+result);
			}

}
