package com.dao;
import java.util.HashSet;
import java.util.Set;

import com.bean.Address;
import com.bean.ContractEmployee;

import com.bean.Employee;
import com.bean.FulltimeEmployee;
import com.exceptions.IdNotFoundException;

public class EmployeeDAOImpl {


	

		public static void main(String[] args) {

			Set<Employee> emparr = initializeEmployeeData();
			printEmployeeData(emparr);
			System.out.println("employee detais by id !!!");
			try {
				getEmployeeById(1023);
			} catch (IdNotFoundException e) {

				System.out.println("Enter valid id no");
				//e.printStackTrace();
			}
		}

		private static void printEmployeeData(Set<Employee> emparr) {

			for (Employee e : emparr) {
				System.out.println(e.getName() + " " + e.getId() + " " + e.getAddress().getArea());

				if (e instanceof FulltimeEmployee) {
					FulltimeEmployee fe = (FulltimeEmployee) e;
					System.out.println(fe.getInsurenceplan() + " " + fe.getLeaves());
				} else if (e instanceof ContractEmployee) {
					ContractEmployee ce = (ContractEmployee) e;
					System.out.println(ce.getContract() + " " + ce.getEmployername());
				}
			}

		}

		/*
		 * Initialize Employee data
		 */
		public static Set<Employee> initializeEmployeeData() {

			Address add1 = new Address(5515, "Peachtress", "Atlanta");
			Address add2 = new Address(1907, "10th street", "charleston");

			FulltimeEmployee fe1 = new FulltimeEmployee(101, "Harsha", add1, "Special", 10);
			FulltimeEmployee fe2 = new FulltimeEmployee(102, "Krishna", add2, "upgraded", 15);

			ContractEmployee ce1 = new ContractEmployee(501, "vardhan", add1, "future tech", 55, 5);
			ContractEmployee ce2 = new ContractEmployee(502, "jaya", add2, "home depo", 65, 2);
			
			Set<Employee> setemployee = new HashSet<Employee>();
			setemployee.add(fe1);
			setemployee.add(fe2);
			setemployee.add(ce1);
			setemployee.add(ce1);

	/*		Employee[] emparr = new Employee[4];
			emparr[0] = fe1;
			emparr[1] = fe2;
			emparr[2] = ce1;
			emparr[3] = ce2;
			emparr[4] = ce2;

			return emparr;*/
			return setemployee;
		}

		public static Employee getEmployeeById(int empId) throws IdNotFoundException {

			for (Employee e : initializeEmployeeData()) {
				if (e.getId() == empId) {
					System.out.println(e.getName() + " " + e.getId() + " " + e.getAddress().getArea());
					return e;

				}
			}
			throw new IdNotFoundException("Employee with id : " + empId + " not found !!");

		}

	}



