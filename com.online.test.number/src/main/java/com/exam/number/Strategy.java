package com.exam.number;

public class Strategy implements IStrategy{

	public RESULT compute(int number) {
		if(number%3 ==0 && number%5 == 0) {
			return RESULT.FizzBuzz;
		}
		if(number%3 == 0) {
           return RESULT.Fizz;			
		}
		if(number%5 == 0) {
			return RESULT.Buzz;
		}	
		RESULT.Other.set(number);
		
		return RESULT.Other;
	}


}
