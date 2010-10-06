package jagrammar.exception;


public class UnacceptableFieldException extends JaCompileException {

    @Override
    public String getMessage() {
        return "an attempt was made to add an already defined field to a class";
    }
}
