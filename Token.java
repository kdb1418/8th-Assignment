import java.util.StringTokenizer;
public class Token {
	private double op2, result;
	private String op;
	private int count = 0;
	public Token(String temp) {
		Calculator c = new Calculator();
		StringTokenizer  s = new StringTokenizer (temp, "+,-,*,/,=");
		StringTokenizer  s2 = new StringTokenizer (temp, "0,1,2,3,4,5,6,7,8,9,.,=");
		count = s2.countTokens();
		result = Double.parseDouble(s.nextToken());
		for(int i=0; i<count; i++) {
			op = s2.nextToken();
			op2 = Double.parseDouble(s.nextToken());
			result = c.result(op, result, op2);
		}
	}
	double getResult() {
		return result;
	}
}
