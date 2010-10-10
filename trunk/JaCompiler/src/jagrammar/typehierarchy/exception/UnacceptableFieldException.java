package jagrammar.typehierarchy.exception;


public class UnacceptableFieldException extends RuntimeException {

    @Override
    public String getMessage() {
        return "an attempt was made to add an already defined field to a class";
    }
}
