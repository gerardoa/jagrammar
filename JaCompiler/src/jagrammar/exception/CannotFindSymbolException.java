package jagrammar.exception;

/**
 *
 * @author IlianaPetrova
 */
public class CannotFindSymbolException extends JaCompileException {

    private String symbol;
    private String location;

    public CannotFindSymbolException(String symbol, String location, int line, int pos) {
        super(line, pos);
        this.symbol = symbol;
        this.location = location;
    }

    @Override
    public String getMessage() {
        return "Cannot find symbol " + symbol + " in " + location;
    }
}
