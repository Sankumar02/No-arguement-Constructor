package com.Class.org;

public class Employee {
	 //No Argument constructor is nothing but there will be no parameters and it also allow us to write logic when object is created.
	//It is not a Default Constructor

	String LeaveType;
	int NoOfDays;
	
	//Define a No Arg Constructor
	//Always constructor should be called with the same class name.
	Employee(){
		LeaveType="Casual";
		NoOfDays=2;
		System.out.println("Leave type is " +LeaveType+ " and No of Days is "+NoOfDays);
		
	}
	
	public static void main(String[] args) {
		Employee employee= new Employee();

	}

}