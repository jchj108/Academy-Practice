package com.kh.homework.employee.controller;

import com.kh.homework.employee.model.vo.Employee;

public class Employeecontroller {

	Employee e = new Employee();

	public void add(int empNo, String name, char gender, String phone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	}

	public void add(int empNo, String name, char gender, String phone, String dept) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
	}

	public void modify(String phone) {
		e.setPhone(phone);
	}

	public void modify(int salary) {
		e.setSalary(salary);
	}

	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		e = null;
		return e;
	}
	
	public String inform() {
		
	}
}
