package jagrammar.util;

import jagrammar.typehierarchy.ArrayType;
import jagrammar.typehierarchy.Type;

/**
 *
 * @author Gerardo
 */
public class ParserHelper {

    /**
     * Crea un array di dimensioni dim, a partire dal tipo ospite passando in ingresso;
     * ritorna un Type perche' potrebbe non restituire un ComplexType se dim e' uguale a 0
     * 
     * @param t Tipo ospite
     * @param dim Dimensioni dell'array
     * @return array dim - dimensionale
     */
    public static Type createArrayType(Type t, int dim) {
        for (int i = 0; i < dim; i++) {
            t = new ArrayType(t);
        }
        return t;
    }
}
