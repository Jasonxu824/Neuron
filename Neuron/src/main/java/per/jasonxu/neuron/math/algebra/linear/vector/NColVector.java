package per.jasonxu.neuron.math.algebra.linear.vector;

import per.jasonxu.neuron.math.algebra.linear.common.Computable;

public class NColVector<T extends Computable<T>> extends NVector<T> {	
	public NColVector(T[] data) {
		super(VectorType.ColumnVector, data, new NColVectorSize(data.length));
	}

	@Override
	public NVector<T> newInstance(T[] data) {
		return new NColVector<T>(data);
	}
}
