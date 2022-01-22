package org.com.companyname;

	public class Extending_Thread_class extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		Extending_Thread_class mt = new  Extending_Thread_class();
	  		mt.start();
	 	}
	}


