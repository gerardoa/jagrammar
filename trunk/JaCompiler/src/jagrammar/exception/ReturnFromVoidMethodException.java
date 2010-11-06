package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class ReturnFromVoidMethodException extends JaCompileException {

    public ReturnFromVoidMethodException(int line, int pos) {
        super(line, pos);
    }

    @Override
    public String getMessage() {
        return "Cannot return a value from method whose result type is void";
    }
}
