package org.com.companyname;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
public class DimandProblem_Using_OOPss implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	DimandProblem_Using_OOPss ob = new DimandProblem_Using_OOPss(); 
        ob.show(); 
    } 
}

	


