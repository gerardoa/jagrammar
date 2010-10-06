/*
 *	il tipo ARRAY di Ja. Tipo composto.
 *
 *      @author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *	@see Type
 *	@see ComplexType
 */
package jagrammar.typehierarchy;

import jagrammar.exception.*;

public class ArrayType extends ComplexType {

    public ArrayType(Type host) {
        if ((host.isNull()) || (host.isVoid())) {
            throw new BadHostTypeException();
        }
        hostType = host;
    }

    public Type getHostType() {
        return hostType;
    }

    public boolean isArray() {
        return true;
    }

    public boolean isReference() {
        return false;
    }

    public boolean isSubtypeOf(Type t) {
        /*
         *	un array è sottotipo di un altro array (t) se
         *	lo sono i rispettivi tipi ospiti. Oppure se
         *	t è Object.
         */
        if (t.equals(ReferenceType.OBJECT)) {
            return true;
        }
        if (t.isArray()) {
            Type ht = ((ArrayType) t).getHostType();
            if (ht.isBasic()) {
                return hostType.equals(ht);
            }
            return hostType.isSubtypeOf(ht);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int res = hostType.hashCode();
        //introduco uno shift circolare di un passo per caratterizzare questo tipo di arrayType
        return ((res >> 1) | (res << 31));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!(obj instanceof ArrayType))
            return false;
        final ArrayType other = (ArrayType) obj;
        return other.hostType.equals(hostType);
    }

    @Override
    public String toString() {
        return hostType + "[]";
    }

    
    private final Type hostType;
}
