package org.com.companyname;

	abstract class AnonymousInnerClas {
		   public abstract void display();
		}


		public class Anonymous_InnerClass_Program {

		public static void main(String[] args) {
			AnonymousInnerClas i = new AnonymousInnerClas() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}




