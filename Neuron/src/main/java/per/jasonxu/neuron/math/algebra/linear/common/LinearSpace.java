package per.jasonxu.neuron.math.algebra.linear.common;

public abstract class LinearSpace {
	private LinearSpaceSize size;
	private final String name;
	
	protected LinearSpace(String name, LinearSpaceSize size) {
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return this.name;
	}
	
	public LinearSpaceSize getSize() {
		return size;
	}
}
