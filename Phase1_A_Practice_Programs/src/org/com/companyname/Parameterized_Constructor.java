package org.com.companyname;
	class Std{
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}

	public class Parameterized_Constructor {
		
	public static void main(String[] args) {

		Std std1=new Std(2,"Jhony");
		Std std2=new Std(8,"Remo");
		std1.display();
		std2.display();
			}
	}


}
