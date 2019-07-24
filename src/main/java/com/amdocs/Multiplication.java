package com.amdocs;

public class Multiplication implements Op{
	
	int op1;
	int op2;
	public Multiplication(int op1,int op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	public  int performOperation() {
		return op1*op2;
	}
}