package jagrammar.exception;

/**
 *
 * @author IlianaPetrova
 */
public class InvalidMethodDeclarationException extends JaCompileException {

    public InvalidMethodDeclarationException(int line, int pos) {
        super(line, pos);
    }

    @Override
    public String getMessage() {
        return "Invalid method declaration; return type required";
    }
}
