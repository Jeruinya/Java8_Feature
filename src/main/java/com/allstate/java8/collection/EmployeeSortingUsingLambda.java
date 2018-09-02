package com.allstate.java8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortingUsingLambda {
	private int empNo;
	private String empName;

	EmployeeSortingUsingLambda(int empNo, String empName) {
		this.empName = empName;
		this.empNo = empNo;
	}

	public String toString() {
		return empNo + "--" + empName;
	}

	public static void main(String[] args) {

		List<EmployeeSortingUsingLambda> i = new ArrayList<>();
		i.add(new EmployeeSortingUsingLambda(101, "Ram"));
		i.add(new EmployeeSortingUsingLambda(201, "Raju"));
		i.add(new EmployeeSortingUsingLambda(101, "Manoj"));
		i.add(new EmployeeSortingUsingLambda(1, "Sahil"));
		i.add(new EmployeeSortingUsingLambda(10, "Yadu"));
		i.add(new EmployeeSortingUsingLambda(103, "Rinku"));

		System.out.println(i);
		Collections.sort(i, (I1, I2) -> I1.empNo > I2.empNo ? 1 : I1.empNo < I2.empNo ? -1 : 0);
		System.out.println("After sorting:" + i);

	}

}
