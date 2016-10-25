package per.jasonxu.neuron.math.common.exception;

import per.jasonxu.neuron.math.algebra.linear.common.LinearSpaceSize;

public class SizeIsNotFitException extends RuntimeException {
	private static final long serialVersionUID = 1306527300508707359L;
	public SizeIsNotFitException(int factDimention, int requireDimention) {
		super("Dimention is not fit, fact = " + factDimention + ", require = " + requireDimention);
	}
	
	public SizeIsNotFitException(LinearSpaceSize fact, LinearSpaceSize require) {
		super("Size is not fit, fact row = " + fact.getRow() + ", col = " + fact.getCol() + "; require row = " + require.getRow() + "require col = " + require.getCol());
	}
}
