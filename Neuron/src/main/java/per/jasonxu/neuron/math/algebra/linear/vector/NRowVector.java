package per.jasonxu.neuron.math.algebra.linear.vector;

import per.jasonxu.neuron.math.algebra.linear.common.Computable;

public class NRowVector<T extends Computable<T>> extends NVector<T> {
	public NRowVector(T[] data) {
		super(VectorType.RowVector, data, new NColVectorSize(data.length));
	}
	
	public NRowVector(Object[] data) {
		super(VectorType.RowVector, data, new NColVectorSize(data.length));
	}

	@Override
	protected NVector<T> newInstance(Object[] data) {
		return new NRowVector<T>(data);
	}
}
