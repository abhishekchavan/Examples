package com.bezudar.misc.interviewquestions;

public class SystemExitFinally {
	
	public static void main(String[] args) {
		try{
			System.exit(0);
		}finally{
			System.out.println("Finally Called");
		}
	}

}
