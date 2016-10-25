package per.jasonxu.neuron.math.common.exception;

import per.jasonxu.neuron.math.algebra.linear.common.LinearSpace;

public class TypeIsNotFitException extends RuntimeException {
	private static final long serialVersionUID = 7060198782370177439L;
	public TypeIsNotFitException(LinearSpace fact, LinearSpace require) {
		super("Space type is not fit, fact is " + fact.getName() + ", require is " + require.getName());
	}
}
