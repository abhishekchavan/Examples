package com.bezudar.misc.object;
import java.util.ArrayList;
import java.util.List;

public class ObjectSizeCalcTest {

	static class Employee {
		public int age;
		public int id;
		public String name;

		public Employee(int age, int id, String name) {
			super();
			this.age = age;
			this.id = id;
			this.name = name;
		}
	}

	private static void print(String msg, Object o) {
		System.out.println(msg + " -> " + ObjectSizeCalculator.getObjectSize(o));
	}

	public static void main(final String[] args) {
		Employee e1 = new Employee(30, 87987, "Ramasubramanian");
		Employee e2 = new Employee(54, 879800, "Sankar");
		Employee e3 = new Employee(23, 364767, "Adithya");
		print("E1 size", e1);
		print("E2 size", e2);
		print("E3 size", e3);
		List<Employee> l = new ArrayList<ObjectSizeCalcTest.Employee>();
		l.add(e1);
		l.add(e2);
		print("Default list size with e1 and e2", l);
		l.add(e1);
		print("Default list size with 2 e1 and 1 e2", l);
		l.add(e3);
		print("Default list size with 2 e1,1 e2 and 1 e3", l);
		List<Employee> l2 = new ArrayList<ObjectSizeCalcTest.Employee>(2);
		l2.add(e1);
		l2.add(e2);
		l2.add(e3);
		print("Predefined sized list size with 1 e1,1 e2 and 1 e3", l2);
	}

}