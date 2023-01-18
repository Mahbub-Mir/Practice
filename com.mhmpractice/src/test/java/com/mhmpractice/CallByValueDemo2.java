package com.mhmpractice;

public class CallByValueDemo2 {

	public static void main(String[] args) {
		// Note: in call by value, changes in any of the variables will not affect the
		// other
		int a = 1000;
		System.out.println("Original value of 'a' is: " + a);
		int b;
		b = a; // a = b is not valid Assignment is always right to left, whatever in a is given
				// to b
		System.out.println("The value of 'b' when 'b = a' is: " + b);
		b = 2000;
		System.out.println("The value of 'a' after assigning a new value for 'b' is: " + a);
		System.out.println("The value of 'b' after assigning a new value for 'b' is: " + b);

		// System.out.println(System.getProperty("user.dir"));

	}

}
