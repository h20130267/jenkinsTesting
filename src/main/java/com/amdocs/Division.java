package com.amdocs;

public class Division implements Op{
	
	int op1;
	int op2;
	public Division(int op1,int op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	public  int performOperation() {
		return op2/op1;
	}
}