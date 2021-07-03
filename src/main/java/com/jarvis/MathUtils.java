package com.jarvis;

public class MathUtils{
	private static final Exception ArithmeticException = null;
	public static double finalval = 0.0;

	
	public  double add(double num) {
		finalval+=num;
		return finalval;
		
	}
	
	public  double mul(double num) {
		finalval*=num;
		return finalval;
		
	}
	
	public  double div(double num) throws Exception {
		
		if((finalval==0.0) & (num ==0)) {
			System.out.println("Error! ArithmeticException");
			throw ArithmeticException;
		}else {
			finalval/=num;
		}
		return finalval;
	
	
	
	}
	
	public  double sub(double num) {
		finalval-=num;
		return finalval;
		
	}
	
	
	public  double def_val(double num) {
		finalval =num;
		return finalval;
		
	}
	
}

