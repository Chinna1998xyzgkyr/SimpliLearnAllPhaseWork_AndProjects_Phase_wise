package org.com.companyname;

import org.com.companyname.AbstractionProgram.Circle;
import org.com.companyname.AbstractionProgram.Rectangle;
import org.com.companyname.AbstractionProgram.Shape;

public class Test_abstract_Class_Main_For_Circle_Rectangle {
 
	    public static void main(String[] args) 
	    { 
	        Shape s1 = new Circle("Red", 2.2); 
	        Shape s2 = new Rectangle("Yellow", 2, 4);
	        System.out.println(s1.toString()); 
	        System.out.println(s2.toString()); 
	    } }


