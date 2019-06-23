package com.exam.number;

/**
 * @author yanxia
 *
 */
public class StrategyDec implements IStrategy {

	IStrategy strategy;
	

	/**
	 * Decorate the original strategy.
	 * @param strategy
	 */
	public StrategyDec(IStrategy strategy) {
		this.strategy = strategy;
	}

	public RESULT compute(int number) {
		RESULT originalResult = this.strategy.compute(number);
		RESULT finalResult = RESULT.Other;
		finalResult.set(number);

		if (originalResult.equals(RESULT.FizzBuzz)) {
			return originalResult;
		}

		String numString = Integer.toString(number);
		boolean showFizz = false;
		boolean showBuzz = false;

		if (numString.contains("3") || originalResult.equals(RESULT.Fizz)) {
			showFizz = true;
			finalResult = RESULT.Fizz;
		}
		if (numString.contains("5") || originalResult.equals(RESULT.Buzz)) {
			showBuzz = true;
			 finalResult = RESULT.Buzz;
		}

		if (showFizz && showBuzz) {
			finalResult = RESULT.FizzBuzz;
		}
		return finalResult;
	}

}
