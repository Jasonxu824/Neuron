package per.jasonxu.neuron.math.algebra.linear.common;

public interface Computable <IN> {
	public Object add(IN augend);
	public Object sub(IN minuend);
	public Object multiply(IN multiplicand);
	public Object divide(IN dividend);
}
