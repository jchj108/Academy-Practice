package com.kh.homework.employee.model.vo;

public class Employee {

	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	public Employee() {	
	}
	
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char Getgender() {
		return gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String dept() {
		return dept;
	}

	public String printEmployee() {
		String print = "";
		if(empNo != 0) {
			print += empNo + "\t";
		}
		if(name != null) {
			print += name + "\t";
		}
		if(gender != '\u0000') {
			print += gender + "\t";
		}
		if(phone != null) {
			print += phone + "\t";
		}
		if(dept != null) {
			print += dept + "\t";
		}
		if(salary != 0) {
			print += salary + "\t";
		}
		if(bonus != 0.0) {
			print += bonus + "\t";
		}
		
		return print;
	}
}
