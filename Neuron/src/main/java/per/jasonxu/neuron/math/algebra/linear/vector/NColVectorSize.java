package per.jasonxu.neuron.math.algebra.linear.vector;

public class NColVectorSize extends NVectorSize {
	public NColVectorSize(int dimention) {
		super(dimention, 0);
	}

	@Override
	public int getDimention() {
		return this.row;
	}
}
