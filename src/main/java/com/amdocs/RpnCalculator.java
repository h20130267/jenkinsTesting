package com.amdocs;
import java.util.*;


public class RpnCalculator {
	String postfixExpression;

	public RpnCalculator(String postfixExpression) {
		super();
		this.postfixExpression = postfixExpression;
	}

	public int calculateExpression() {
		String[] words=postfixExpression.split(" ");
		Stack<Integer> stack = new Stack<Integer>(); 
		
		for(String w:words){  
			
			if ( w.equals("+")) { 
				Op ad = new Addition(stack.pop(),stack.pop());
				stack.push(ad.performOperation());
				
			}else if (w.equals("-")) {
				Op sub = new Subtraction(stack.pop(),stack.pop());
				stack.push(sub.performOperation());
				
			}else if (w.equals("*")) {
				Op mul = new Multiplication(stack.pop(),stack.pop());
				stack.push(mul.performOperation());
				
			}else if (w.equals("/")) {
				Op div = new Division(stack.pop(),stack.pop());
				stack.push(div.performOperation());
				
			}else {
				
				stack.push(Integer.parseInt(w)); 	
			}
			
		} 
		return stack.pop();
	}
	
	
	
}
