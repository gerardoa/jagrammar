package jagrammar.exception;

/**
 *
 * @author IlianaPetrova
 */
public class JaCompileException extends RuntimeException {

    protected int line;
    protected int pos;

    public JaCompileException(int line, int pos) {
        this.line = line;
        this.pos = pos;
    }

    public int getLine() {
        return line;
    }

    public int getPosition() {
        return pos;
    }
}
