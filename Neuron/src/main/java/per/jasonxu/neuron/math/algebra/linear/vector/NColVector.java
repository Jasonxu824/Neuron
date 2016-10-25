package per.jasonxu.neuron.math.algebra.linear.vector;

import per.jasonxu.neuron.math.algebra.linear.common.Computable;

public class NColVector<T extends Computable<T>> extends NVector<T> {	
	public NColVector(T[] data) {
		super(VectorType.ColumnVector, data, new NColVectorSize(data.length));
	}
	
	private NColVector(Object[] data) {
		super(VectorType.ColumnVector, data, new NColVectorSize(data.length));
	}

	@Override
	protected NVector<T> newInstance(Object[] data) {
		return new NColVector<T>(data);
	}
}
