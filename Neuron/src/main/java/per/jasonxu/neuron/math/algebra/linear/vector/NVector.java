package per.jasonxu.neuron.math.algebra.linear.vector;

import java.util.ArrayList;
import java.util.List;

import per.jasonxu.neuron.math.algebra.linear.common.Computable;
import per.jasonxu.neuron.math.algebra.linear.common.LinearOperation;
import per.jasonxu.neuron.math.algebra.linear.common.LinearSpace;
import per.jasonxu.neuron.math.common.exception.OutOfDimentionException;

public abstract class NVector<T extends Computable<T>> extends LinearSpace implements LinearOperation<NVector<T>> {
	public enum VectorType {
		ColumnVector, RowVector
	}
	
	public abstract NVector<T> newInstance(T[] data);
	
	protected T[] data;
	
	protected NVector(VectorType type, T[] data, NVectorSize size) {
		super(type.name(), size);
		this.data = data;
	}
	
	public T get(int index) {
		if (index - 1 > this.getSize().getDimention()) {
			throw new OutOfDimentionException(index, this.getSize().getDimention());
		}
		
		return this.data[index];
	}
	
	public int getDimention() {
		return this.getSize().getDimention();
	}
	
	@Override
	public NVectorSize getSize() {
		return (NVectorSize) super.getSize();
	}

	@SuppressWarnings("unchecked")
	@Override
	public NVector<T> add(NVector<T> input) {
		ArrayList<T> data = new ArrayList<T>(this.getDimention());
		for (int i = 0; i < this.getDimention(); i++) {
			data.add((T) this.data[i].add(input.get(i)));
		}
		return this.newInstance((T[]) data.toArray());
	}

	@Override
	public NVector<T> sub(NVector<T> input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NVector<T> multiply(NVector<T> input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NVector<T> divide(NVector<T> input) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < this.getSize().getDimention() - 1; i++) {
			sb.append(this.get(i).toString()).append(", ");
		}
		sb.append(this.get(this.getSize().getDimention() - 1));
		sb.append("]");
		return sb.toString();
	}
}
