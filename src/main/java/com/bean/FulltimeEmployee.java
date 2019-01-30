package com.bean;

public class FulltimeEmployee extends Employee {
	private String insurenceplan;
	private int leaves;
	public FulltimeEmployee(int id, String name, Address address, String insurenceplan, int leaves) {
		super(id, name, address);
		this.insurenceplan = insurenceplan;
		this.leaves = leaves;
	}
	public String getInsurenceplan() {
		return insurenceplan;
	}
	public int getLeaves() {
		return leaves;
	}
	@Override
	void salary() {
		int salary = 8000 - (leaves * (8000/22));
		System.out.println(salary);
		
	}
	
	
	
}
