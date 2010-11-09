/*
 *	Eccezione sollevata qualora ci sia
 *      un errore di overriding dovuto
 *      al tipo di ritorno del metodo
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *      @see VisibilityOverridingException
 */
package jagrammar.typehierarchy.exception;

public class ReturnTypeOverridingException extends RuntimeException {

    @Override
    public String getMessage() {
        return "cannot override; return type is not compatible";
    }
}
