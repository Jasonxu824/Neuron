package per.jasonxu.neuron.math.algebra.linear.common;

public class Real implements Computable<Real> {
	private Float value;
	
	public Real(Float value) {
		this.value = value;
	}
	
	private Float getValue() {
		return this.value;
	}

	@Override
	public Real add(Real augend) {
		return new Real(this.value + augend.getValue());
	}

	@Override
	public Real sub(Real minuend) {
		return new Real(this.value - minuend.getValue());
	}

	@Override
	public Real multiply(Real multiplicand) {
		return new Real(this.value - multiplicand.getValue());
	}

	@Override
	public Real divide(Real dividend) {
		return new Real(this.value / dividend.getValue());
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
	
	
}
