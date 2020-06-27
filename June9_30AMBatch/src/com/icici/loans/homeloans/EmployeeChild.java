package com.icici.loans.homeloans;

public class EmployeeChild extends Employee
{
	String city;

	public EmployeeChild(String city) 
	{
		super(10,"ravi",100.00f);
		this.city = city;
		System.out.println(this.city);
	}
	
	
	void m1()
	{
	
	}
	
	

	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("hyderabad");
	}

}
