package com.java.streams.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	
	int empId;
	String name;
	int salary;
	
	public Employee(int empId, String name, int salary) {
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Samuel",4000));
		empList.add(new Employee(2,"Tom",5000));
		empList.add(new Employee(3,"Brain",3000));
		empList.add(new Employee(4,"Kevin",8000));
		empList.add(new Employee(5,"Peter",2000));
		
		List<Integer> empListData =empList.stream().filter(x->x.salary>4000).map(x->x.salary).collect(Collectors.toList());
		System.out.println(empListData);
		System.out.println("----------------------------------");
		List<Integer> empData =empList.stream().filter(x->x.salary>4000).map(x->x.empId).collect(Collectors.toList());
		System.out.println(empData);		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	

}
