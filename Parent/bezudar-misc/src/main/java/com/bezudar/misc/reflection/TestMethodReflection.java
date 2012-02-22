/**
 * 
 */
package com.bezudar.misc.reflection;

import java.lang.reflect.Method;

/**
 * @author Abhishek Chavan
 * 
 */
public class TestMethodReflection {

	public void something(String x) {

	}

	public static void main(String[] args) throws SecurityException, NoSuchMethodException {
		TestMethodReflection x = new TestMethodReflection();

		String y = "";

		Method m = x.getClass().getDeclaredMethod("something", y.getClass());
		System.out.println(m.getName());
	}

}
