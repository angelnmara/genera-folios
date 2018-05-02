package mx.gob.economia.miam.common.foliador.exceptions;

public class LogicException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LogicException(String message, Exception e) {
        super(message, e);
    }

    public LogicException(String message) {
        super(message);
    }
}
