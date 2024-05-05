public class Calculator{

	public static int add(int firstNumber, int secondNumber){
		if (firstNumber >= 0 || secondNumber >= 0) {
			int sum = firstNumber + secondNumber;
			return sum;
		} else {
			System.out.println("Both numbers must be >= 0");
		}	
		return 0;
	}

	public static int subtract(int firstNumber, int secondNumber){
		int difference = firstNumber - secondNumber;
		return difference;
	}

	public static int multiplication(int firstNumber, int secondNumber){
		int multiply = 0;
		for (int i = 1; i <= secondNumber; i++){
			multiply += firstNumber;
		}
		return multiply;
	}

	//public static boolean ispalindrome(int number){
		//String digits = "" + number;  //"11211"
		//String numberInReverse = "";
		//for(int index = digits.length()-1; 1index >+0; index--){
		//	numberInReverse = numberInReverse + digits.chaAt(inde_x);
		//}
		//return false	
	//}
	//public static boolean ispalindrome(int number){
		//String digits = "" + number;  //"11211"
		//String numberInReverse = "";
		//for(int index = digits.length()-1; 1index >+0; index--){
		//	numberInReverse = numberInReverse + digits.chaAt(inde_x);
		//}
	//return false
			
	//}
}