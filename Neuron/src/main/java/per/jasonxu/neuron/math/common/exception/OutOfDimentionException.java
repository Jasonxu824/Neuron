package per.jasonxu.neuron.math.common.exception;

public class OutOfDimentionException extends RuntimeException {
	private static final long serialVersionUID = 5000834802704956293L;
	
	public OutOfDimentionException(int fact, int limit) {
		super("Access space position(" + fact + ") out of dimention(" + limit + ")");
	}
}
