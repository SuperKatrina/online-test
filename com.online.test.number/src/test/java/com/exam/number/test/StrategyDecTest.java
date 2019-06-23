package com.exam.number.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.exam.number.IStrategy;
import com.exam.number.Strategy;
import com.exam.number.StrategyDec;
import com.exam.number.IStrategy.RESULT;

public class StrategyDecTest {

	@Test
	public void test() {
		 IStrategy strategyDec = new StrategyDec(new Strategy());

		 for(int i =1 ; i<= 100; i++) {
			    RESULT res = strategyDec.compute(i);
				
				if(res.equals(RESULT.Fizz)) {
					assertTrue(i%3==0 || (Integer.toString(i)).contains("3"));
					assertFalse(i%5==0 || (Integer.toString(i)).contains("5"));
				}
				if(res.equals(RESULT.Buzz)) {
					assertTrue(i%5==0 || (Integer.toString(i)).contains("5"));
					assertFalse(i%3==0 || (Integer.toString(i)).contains("3"));
				}
				if(res.equals(RESULT.FizzBuzz)) {
					assertTrue(i%3==0 || (Integer.toString(i)).contains("3"));
					assertTrue(i%5==0 || (Integer.toString(i)).contains("5"));
				}
		        //Output as the test required.
			    System.out.println(res);
		}
		
	}

}
