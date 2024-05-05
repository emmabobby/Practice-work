import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest{

	@org.junit.jupiter.api.Test
	public void testThatCalculatorCanAddTwoPositiveNumbers(){
		int sum = Calculator.add(2,2);
		int expectedSum = 4;
		//assertion
		assertEquals(expectedSum, sum);	
			
        }

	@org.junit.jupiter.api.Test
	public void testThatBothNumbersAreNonNegative() {
		int sum = Calculator.add(-2, -2);
		String expectedOutcome = "Both numbers must be >= 0";
		assertEquals(expectedOutcome, sum);
	}

	

	@org.junit.jupiter.api.Test
	public void testThatCalculatorCanSubtractSecondNumberFromFirstNumber(){
		int difference = Calculator.subtract(2,2);
		int expectedDifference = 0;
		//assertion
		assertEquals(expectedDifference, difference);
	}

	@org.junit.jupiter.api.Test
	public void testThatCalculateCanMultiplyTwoNumber() {
		int multiply = Calculator.multiplication(2,3);
		int expectedMultiply = 6;
		
		//assertions
		assertEquals(expectedMultiply, multiply);
	}


}