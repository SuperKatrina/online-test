/**
 * 
 */
package com.exam.number.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.exam.number.IStrategy;
import com.exam.number.Strategy;
import com.exam.number.IStrategy.RESULT;

/**
 * @author yanxia
 *
 */
public class StrategyTest {

	/*
	 * 
	 * */
	@Test
	public void test() {
		IStrategy strategy = new Strategy();
		
		for(int i = 1 ; i<= 100; i++) {
			RESULT res = strategy.compute(i);
			if(res.equals(RESULT.Fizz)) {
				assertTrue(i%3==0);
				assertFalse(i%5==0);
			}
			if(res.equals(RESULT.Buzz)) {
				assertTrue(i%5==0);
				assertFalse(i%3==0);
			}
			if(res.equals(RESULT.FizzBuzz)) {
				assertTrue(i%3==0);
				assertTrue(i%5==0);
				
			}
			//Output as the test required.
			System.out.println(res);
		}
	}
}
