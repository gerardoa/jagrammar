package jagrammar.exception;

/**
 *
 * @author IlianaPetrova
 */
public class UnexpectedTypeException extends JaCompileException {

    private String required;
    private String found;

    public UnexpectedTypeException(String required, String found, int line, int pos) {
        super(line, pos);
        this.required = required;
        this.found = found;
    }

    @Override
    public String getMessage() {
        return "Unexpected type. Required: " + required + "; Found: " + found;
    }
}
