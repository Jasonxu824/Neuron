package per.jasonxu.neuron.math.common.exception;

public class OperationNotSupportException extends RuntimeException {
	private static final long serialVersionUID = -7894469223502133495L;
	public OperationNotSupportException(String opt, String obj) {
		super("Operation [" + opt + "] is not support by " + obj);
	}
}
