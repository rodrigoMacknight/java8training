package java8Tests;

public class MoreLambdaTests {

	public static void main(String[] args) {
		
		MoreLambdaTests mlt = new MoreLambdaTests();
		//we declare a lambda operation by implementing the 
		//single method that the interface contains
		MathOperation addition = (int a, int b) -> a + b;
		//we dont need to excplicity the values here.
		MathOperation subtraction = (a,b) -> a - b;
		//we can have more than 1 expression if we use {}
		MathOperation doubleMultiplication = (a,b) -> {
			int ret = a * b;
			return ret*2;
		};
		
		System.out.println("Addition: " + mlt.operate(10,5,addition));
		System.out.println("subtraction: " + mlt.operate(10,5,subtraction));
		System.out.println("doublemultiplication: " +mlt.operate(10,5,doubleMultiplication));
	}
	
	private int operate(int a, int b, MathOperation operationHolder) {
		return operationHolder.operation(a, b);
	}
	
	//lambda uses a single method interface
	interface MathOperation{
		int operation(int a, int b);
	}
}
