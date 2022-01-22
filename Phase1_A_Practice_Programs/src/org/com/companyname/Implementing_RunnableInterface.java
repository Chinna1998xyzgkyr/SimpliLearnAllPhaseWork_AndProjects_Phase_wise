package org.com.companyname;
	public class Implementing_RunnableInterface implements Runnable{
		 
	    public static int myCount = 0;
	    public Implementing_RunnableInterface(){
	         
	    }
	    public void run() {
	        while(Implementing_RunnableInterface.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++Implementing_RunnableInterface.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        Implementing_RunnableInterface mrt = new Implementing_RunnableInterface();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(Implementing_RunnableInterface.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++Implementing_RunnableInterface.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
	}



