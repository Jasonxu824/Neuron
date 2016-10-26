package per.jasonxu.neuron.math.algebra.linear.vector;

import per.jasonxu.neuron.math.algebra.linear.common.Computable;
import per.jasonxu.neuron.math.algebra.linear.common.LinearOperation;
import per.jasonxu.neuron.math.algebra.linear.common.LinearSpace;
import per.jasonxu.neuron.math.common.exception.OperationNotSupportException;
import per.jasonxu.neuron.math.common.exception.OutOfDimentionException;
import per.jasonxu.neuron.math.common.exception.SizeIsNotFitException;
import per.jasonxu.neuron.math.common.exception.TypeIsNotFitException;

public abstract class NVector<T extends Computable<T>> extends LinearSpace implements LinearOperation<NVector<T>>  {
	public enum VectorType {
		ColumnVector, RowVector
	}
	
	protected abstract NVector<T> newInstance(Object[] data);
	
	protected Object[] data;
	
	protected NVector(VectorType type, T[] data, NVectorSize size) {
		super(type.name(), size);
		this.data = data;
	}
	
	protected NVector(VectorType type, Object[] data, NVectorSize size) {
		super(type.name(), size);
		this.data = data;
	}
	
	private void checkTypeAndRange(LinearSpace space) {
		if (!(space instanceof NVector)) {
			throw new TypeIsNotFitException(space, this);
		}
		
		if (((NVector<?>) space).getDimention() != this.getDimention()) {
			throw new SizeIsNotFitException(((NVector<?>) space).getDimention(), this.getDimention());
		}
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index > this.getSize().getDimention() - 1) {
			throw new OutOfDimentionException(index, this.getSize().getDimention());
		}
		
		return (T) this.data[index];
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
		checkTypeAndRange(input);
		Object[] data = new Object[this.getDimention()];
		for (int i = 0; i < this.getDimention(); i++) {
			data[i] = ((T)this.data[i]).add(input.get(i));
		}
		return this.newInstance(data);
	}

	@SuppressWarnings("unchecked")
	@Override
	public NVector<T> sub(NVector<T> input) {
		checkTypeAndRange(input);
		Object[] data = new Object[this.getDimention()];
		for (int i = 0; i < this.getDimention(); i++) {
			data[i] = ((T)this.data[i]).sub(input.get(i));
		}
		return this.newInstance(data);
	}

	@Override
	public NVector<T> multiply(NVector<T> input) {
		throw new OperationNotSupportException("multiply", this.getName());
	}

	@Override
	public NVector<T> divide(NVector<T> input) {
		throw new OperationNotSupportException("divide", this.getName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public T dot(NVector<T> input) {
		checkTypeAndRange(input);
		T result = null;
		if (this.getDimention() > 0) {
		    result = (T)((T)this.data[0]).multiply(input.get(0));
		}
		for (int i = 1; i < this.getDimention(); i++) {
			T tmp = (T)((T)this.data[i]).multiply(input.get(i));
			result = (T) result.add(tmp);
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public NVector<T> dot(T input) {
		Object[] tmp = new Object[this.getDimention()];
		for (int i = 0; i < this.getDimention(); i++) {
			tmp[i] = (T)((T)this.data[i]).multiply(input);
		}
		return this.newInstance(tmp);
	}

	@Override
	public Object cross(NVector<T> input) {
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
