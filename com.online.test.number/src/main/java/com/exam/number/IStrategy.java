package com.exam.number;


public interface IStrategy {
	enum RESULT {
		Fizz, Buzz, FizzBuzz, Other;
		
		int num = 0;
		
		public void set(int num) {
			this.num = num;
		}
	
		@Override
		public String toString() {
			if(this.equals(RESULT.Other)) {
				return Integer.toString(num);
			}else {
				return super.toString();
			}
		}
	
	};
	
	public RESULT compute (int input);	

}
