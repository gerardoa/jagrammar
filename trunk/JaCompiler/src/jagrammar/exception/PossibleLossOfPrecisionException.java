package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class PossibleLossOfPrecisionException extends JaCompileException {

    private String required;
    private String found;

    public PossibleLossOfPrecisionException(String required, String found, int line, int pos) {
        super(line, pos);
        this.required = required;
        this.found = found;
    }

    @Override
    public String getMessage() {
        return "Possible loss of precision. Required: " + required + "; Found: " + found;
    }
}
