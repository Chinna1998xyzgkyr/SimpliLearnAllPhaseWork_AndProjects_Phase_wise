package org.com.companyname;

public class Demonstrate_Throws_Keyword {
        void Division() throws ArithmeticException
        {
            int a=45,b=0,rs;
       rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
         public static void main(String[] args)
        {
        	 Demonstrate_Throws_Keyword T = new Demonstrate_Throws_Keyword();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            System.out.print("\n\tEnd of program.");
        }
    }


