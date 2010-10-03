/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar.util;

import jagrammar.typehierarchy.ArrayType;
import jagrammar.typehierarchy.Type;

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
}
