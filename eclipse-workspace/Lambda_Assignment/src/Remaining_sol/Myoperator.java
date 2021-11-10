package Remaining_sol;

import java.util.function.UnaryOperator;

public class Myoperator implements UnaryOperator<String>{

	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}
	

}
