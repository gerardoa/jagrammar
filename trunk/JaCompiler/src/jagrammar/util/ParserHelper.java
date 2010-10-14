package jagrammar.util;

import jagrammar.typehierarchy.ArrayType;
import jagrammar.typehierarchy.BasicType;
import jagrammar.typehierarchy.ReferenceType;
import jagrammar.typehierarchy.Type;
import org.antlr.runtime.tree.CommonTree;
import jagrammar.exception.*;
import org.antlr.runtime.Token;

/**
 *
 * @author Gerardo
 */
public class ParserHelper {

    /**
     * ritorna un Type perche' potrebbe non restituire un ComplexType se dim e' uguale a 0
     * @param t Tipo ospite
     * @param dim Dimensioni dell'array
     * @return
     */
    public static Type createArrayType(Type t, int dim) {
        for (int i = 0; i < dim; i++) {
            t = new ArrayType(t);
        }
        return t;
    }

    public static void debugCT(CommonTree ct) {
        Token t = ct.getToken();
        return;
    }

}