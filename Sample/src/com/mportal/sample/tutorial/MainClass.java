package com.mportal.sample.tutorial;

import com.google.gson.Gson;
import com.mportal.sample.tutorial.EmployeeProtos.Employee;

public class MainClass {
	public static void main(String[] args) {
		Employee employee = Employee.newBuilder()
				.setName("Steven P. Jobs")
				.setId(1010)
				.setEmail("sjobs@apple.com")
				.setTeam("Product")
				.build();
		byte[] data = employee.toByteArray();
		System.out.println(data.length);
	}
}
