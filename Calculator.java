
public class Calculator {
	static double result;
	public double result(String op, double op1, double op2) {
		switch(op) {
		case "+":
			result = op1 + op2; break;
		case "-":
			result = op1 - op2; break;
		case "*":
			result = op1 * op2; break;
		case "/":
			result = op1 / op2; break;
		default: return 0;
		}
		return result;
	}
}


