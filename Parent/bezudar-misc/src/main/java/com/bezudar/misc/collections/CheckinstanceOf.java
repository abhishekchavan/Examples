/**
 * 
 */
package com.bezudar.misc.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhishek Chavan
 * 
 */
public class CheckinstanceOf {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		if (list instanceof List) {
			System.out.println("Assa");
		}
	}
}
