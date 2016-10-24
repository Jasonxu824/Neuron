package per.jasonxu.neuron.math.algebra.linear.vector;

public class NRowVectorSize extends NVectorSize {

	protected NRowVectorSize(int dimention) {
		super(0, dimention);
	}

	@Override
	public int getDimention() {
		return this.col;
	}
}
