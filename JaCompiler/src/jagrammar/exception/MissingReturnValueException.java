package jagrammar.exception;

/**
 *
 * @author IlianaPetrova
 */
public class MissingReturnValueException extends JaCompileException {

    public MissingReturnValueException(int line, int pos) {
        super(line, pos);
    }

    @Override
    public String getMessage() {
        return "Missing return value";
    }
}
