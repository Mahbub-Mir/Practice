package com.mhmpractice;

public class CallByValueDemo {

	int data = 50;

	public void change(int data) {
		data = data + 100; // changes will be in the local variable only
	}

	public static void main(String[] args) {
		CallByValueDemo op = new CallByValueDemo();

		System.out.println("Before change " + op.data);
		// op.change(500);
		System.out.println("After change " + op.data);

	}

}
