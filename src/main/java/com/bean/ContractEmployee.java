package com.bean;

public class ContractEmployee extends Employee {
	private String employername;
	private int rateperhour;
	private int contract;

	public ContractEmployee(int id, String name, Address address, String employername, int rateperhour, int contract) {
		super(id, name, address);
		this.employername = employername;
		this.rateperhour = rateperhour;
		this.contract = contract;
	}

	public String getEmployername() {
		return employername;
	}

	public int getRateperhour() {
		return rateperhour;
	}

	public int getContract() {
		return contract;
	}

	@Override
	void salary() {
		int salary = rateperhour * 8 * 22;
		System.out.println(salary);

	}

}
