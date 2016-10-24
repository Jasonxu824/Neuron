package per.jasonxu.neuron.math.algebra.linear.vector;

import per.jasonxu.neuron.math.algebra.linear.common.LinearSpaceSize;

public abstract class NVectorSize extends LinearSpaceSize {

	protected NVectorSize(int row, int col) {
		super(row, col);
	}
	
	@Override
	public String toString() {
		return "Dimention [" + getDimention() + "]";
	}
	
	public abstract int getDimention();
}

