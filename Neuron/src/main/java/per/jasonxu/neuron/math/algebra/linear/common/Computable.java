package per.jasonxu.neuron.math.algebra.linear.common;

public interface Computable <IN, OUT> {
	public OUT add(IN input);
	public OUT sub(IN input);
	public OUT multiply(IN input);
	public OUT divide(IN input);
}
