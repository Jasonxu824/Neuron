package per.jasonxu.neuron.math.algebra.linear.common;

public interface LinearOperation<IN> extends AlgebraOperation<IN> {
	public abstract Object dot(IN input);
	public abstract Object cross(IN input);
}
