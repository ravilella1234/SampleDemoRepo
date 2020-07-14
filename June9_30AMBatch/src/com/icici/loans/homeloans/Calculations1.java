package com.icici.loans.homeloans;

public class Calculations1 
{
	int a,b,c;
	
	public Calculations1(int a, int b) 
	{
		this.a = a;
		this.b = b;
	}

	public void add()
	{
		c= a+b;
		System.out.println("Add of A & b is : " + c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Sub of A & b is :" + c );
	}
	
	public static void main(String[] args) 
	{
		Calculations1 obj = new Calculations1(10,20);
		obj.add();
		obj.sub();
		
		Calculations1 obj1 = new Calculations1(100,200);
		obj1.add();
		obj1.sub();
		
	}

}
