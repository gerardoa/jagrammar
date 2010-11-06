package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class InconvertibleTypesException extends JaCompileException {

    private String required;
    private String found;

    public InconvertibleTypesException(String required, String found, int line, int pos) {
        super(line, pos);
        this.required = required;
        this.found = found;
    }

    @Override
    public String getMessage() {
        return "Inconvertible types. Required: " + required + "; Found: " + found;
    }
}
