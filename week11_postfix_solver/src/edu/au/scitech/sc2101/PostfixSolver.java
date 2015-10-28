package edu.au.scitech.sc2101;

public class PostfixSolver {
	final int STATE_DIGIT_1 = 10000;	
	final int STATE_DIGIT_2 = 10001;
	final int STATE_OP 		= 10003;
	
	public int solve(String question) {
		Stack stack = new Stack();
		int state = STATE_DIGIT_1;
		
		for(int i=0; i<question.length(); i++) {
			char c = question.charAt(i);
			
			switch(state) {
			case STATE_DIGIT_1:	// expect c to be a digit
				if ( ! Character.isDigit(c)) {
					// invalid input, terminate the solver.
					throw new IllegalArgumentException("Except a digit. "+c);
				}

				stack.push( Integer.parseInt( "" + c ) );
				//System.out.println(stack.toString());
				state = STATE_DIGIT_2;
				break;
				
			case STATE_DIGIT_2:	// expect c to be a digit
				if ( ! Character.isDigit(c)) {
					// invalid input, terminate the solver.
					throw new IllegalArgumentException("Except a digit. "+c);
				}
			
				stack.push( Integer.parseInt( "" + c ) );
				//System.out.println(stack.toString());
				state = STATE_OP;
				break;
				
			case STATE_OP: // expect c to be an operator
				if(c == '+' || c == '-' || c == '*' || c == '/') {
					int operand2 = stack.pop();
					int operand1 = stack.pop();
					// calculate
					int result = 0;
					switch(c) {
					case '+': result = operand1 + operand2; break;
					case '-': result = operand1 - operand2; break;
					case '*': result = operand1 * operand2; break;
					case '/': result = operand1 / operand2; break;
					}
					stack.push(result);
					state = STATE_DIGIT_2;
					
				} else {
					throw new IllegalArgumentException("Except an operator. "+c);
				}
			}
		}
			
		return stack.pop();
	}

}
 