package io.github.joaomlneto.travis_ci_tutorial_java;

public class CalculatorDriver {

	public static void main(String[] args) {
		
		SimpleCalculator calc = new SimpleCalculator();
		
		int result = 10;
		result = calc.mul(result, 3);
		result = calc.mul(result, 7);
		result = calc.mul(result, 13);
		result = calc.mul(result, 37);
		
		System.out.println("The final result is: " + result);

	}

}
