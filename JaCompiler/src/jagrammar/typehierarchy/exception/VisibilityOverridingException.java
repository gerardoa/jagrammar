/*
 *	Eccezione sollevata qualora ci sia
 *      un errore di overriding dovuto
 *      alla visibilità del metodo
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *      @see ReturnTypeOverridingException
 */
package jagrammar.typehierarchy.exception;

public class VisibilityOverridingException extends RuntimeException {

    @Override
    public String getMessage() {
        return "cannot override; attempting to assign weaker access privileges";
    }
}
