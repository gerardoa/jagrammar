package jagrammar.exception;

/**
 *
 * @author IlianaPetrova
 */
public class IncomparableTypesException extends JaCompileException {

    private String type1;
    private String type2;

    public IncomparableTypesException(String type1, String type2, int line, int pos) {
        super(line, pos);
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public String getMessage() {
        return "Incomparable types: " + type1 + " and " + type2;
    }
}
