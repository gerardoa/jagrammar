package jagrammar.exception;

/**
 *
 * @author IlianaPetrova
 */
public class IncompatibleTypesException extends JaCompileException {

    private String required;
    private String found;

    public IncompatibleTypesException(String required, String found, int line, int pos) {
        super(line, pos);
        this.required = required;
        this.found = found;
    }

    @Override
    public String getMessage() {
        return "Incompatible Types. Required: " + required + "; Found: " + found;
    }
}
