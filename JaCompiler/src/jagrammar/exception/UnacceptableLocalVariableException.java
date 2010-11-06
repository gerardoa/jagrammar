package jagrammar.exception;

/**
 *
 * @author Gerardo
 */
public class UnacceptableLocalVariableException extends JaCompileException {

    private String variableName;
    private String methodName;

    public UnacceptableLocalVariableException(String variableName, String methodName, int line, int pos) {
        super(line, pos);
        this.variableName = variableName;
        this.methodName = methodName;
    }

    @Override
    public String getMessage() {
        return variableName + " is already defined in " + methodName + ".";
    }
}
