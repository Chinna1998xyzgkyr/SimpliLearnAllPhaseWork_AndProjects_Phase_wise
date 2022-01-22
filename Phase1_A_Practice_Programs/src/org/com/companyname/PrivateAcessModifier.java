package org.com.companyname;

	class thisPrivateAcess {
	 
	   private void display() 
	    { 
	        System.out.println("this is the private access specifier"); 
	    } 
	} 

	public class PrivateAcessModifier {

		public static void main(String[] args) {
			System.out.println("Private Access Specifier");
			thisPrivateAcess  obj = new thisPrivateAcess(); 
	       

		}
	}



