/*
 *	Un tipo reference del linguaggio Ja
 *
 *	@author Gaetano Pellegrino
 *	@version 1.0 11/06/2010
 *	@see Type
 *	@see ComplexType
 *
 */
package jagrammar.typehierarchy;

import jagrammar.typehierarchy.exception.UnacceptableMethodException;
import jagrammar.typehierarchy.exception.UnacceptableConstructorException;
import jagrammar.typehierarchy.exception.UnacceptableFieldException;
import jagrammar.typehierarchy.exception.EarlyBindingException;
import jagrammar.typehierarchy.exception.ReturnTypeOverridingException;
import jagrammar.typehierarchy.exception.VisibilityOverridingException;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class ReferenceType extends ComplexType {

    public ReferenceType(String n) {
        name = n;
        methods = new HashMap<String, Set<Method>>();
        fields = new HashMap<String, Field>();
        constructors = new LinkedList<Constructor>();
        superClass = OBJECT;
    }

    public void addSuperType(ReferenceType sClass) {
        superClass = sClass;
    }

    public boolean isArray() {
        return false;
    }

    public boolean isReference() {
        return true;
    }

    public boolean isSubtypeOf(Type t) {
        if (equals(t)) {
            return true;
        }
        if (!t.isReference()) {
            return false;
        }
        return superClass.isSubtypeOf(t);
    }

    public ReferenceType getSuperClass() {
        return superClass;
    }

    public String getName() {
        return name;
    }

    /**
     * Ricerca la presenza di un campo nella classe, e nelle sue superclassi.
     * Restituisce il tipo del campo se lo trova, null altrimenti.
     * @param fieldName Nome del campo
     * @return Tipo del campo
     */
    public Type getField(boolean isSameClass, String fieldName) {
        Field f = fields.get(fieldName);

        if (f != null && (isSameClass || f.isPublic)) {
            return f.type;
        }

        if (superClass != null) {
            return superClass.getField(false, fieldName);
        }

        return null;
    }

    /*
     *  METODI:
     *  un method è iterabile sul tipo dei suoi parametri
     * 
     */
    private class Method implements Iterable<Type> {


        /*
         *  Costruttore di metodi.
         *  Si usa un ArrayList per i parametri perché c'è la necessità dell'accesso posizionale
         * 
         *  @param v visibilità del metodo. TRUE se è pubblico, FALSE se è privato
         *  @param n nome del metodo
         *  @param r tipo di ritorno
         *  @param p lista dei tipi dei parametri formali del metodo
         *  
         */
        private Method(boolean v, String n, Type r, ArrayList<Type> p) {
            isPublic = v;
            name = n;
            returnType = r;
            arguments = p;
        }


        /*
         * il criterio di uguaglianza consiste nel confrontare i nomi
         * dei metodi. Se sono uguali allora confronta le liste dei tipi:
         * queste devono avere stessi tipi negli stessi posti, affinché i
         * metodi siano uguali
         *
         * @param x riferimento all'oggetto da confrontare
         * @return  true se i due metodi sono uguali
         */
        @Override
        public boolean equals(Object x) {
            if (x == null) {
                return false;
            }
            if (this == x) {
                return true;
            }
            if (!(x instanceof Method)) {
                return false;
            }
            Method m = (Method) x;
            if (!m.name.equals(name)) {
                return false;
            }
            int i = 0;
            for (Type t : m) {
                if (!t.equals(arguments.get(i++))) {
                    return false;
                }
            }
            return true;
        }

        public Iterator<Type> iterator() {
            return arguments.iterator();
        }

        /*
         * il codice è generato in base al
         * nome del metodo e alla lista dei tipi
         * degli argomenti, tenendo conto anche del
         * loro ordine. E' coerente con equals.
         *
         * @see equals(java.lang.Object)
         * @return l'hash-code del metodo this
         */
        @Override
        public int hashCode() {
            int res = name.hashCode();
            int pos = 1;
            for (Type t : arguments) {
                res ^= t.hashCode();
                //hashCode deve tenere presente la posizione del parametro!
                //shiftiamo circolarmente in base alla posizione
                res = (res >> pos) | (res << (32 - pos));
                pos++;
            }
            return res;
        }

        /*
         * verifica se il metodo this è compatibile con la chiamata call.
         *
         * @param call ArrayList dei tipi degli argomenti della chiamata.
         *              Deve essere un'ArrayList perché si necessita dell'accesso posizionale.
         *              Inoltre call deve essere istanziata.
         * @return TRUE se il metodo this è compatibile con la chiamata call. FALSE altrimenti
         */
        private boolean isCompatibleWith(ArrayList<Type> call) {
            if (call.isEmpty()) {
                return (arguments.isEmpty());
            }

            if (call.size() != arguments.size()) {
                return false;
            }

            int i = 0;
            for (Type t : call) {
                if (!t.isAssignableTo(arguments.get(i++)))//assignableTo deve essere riflessivo
                {
                    return false;
                }
            }
            return true;
        }
        private final boolean isPublic;
        private final String name;
        private final Type returnType;
        private ArrayList<Type> arguments;
    }

    //EDIT: javadoc

    /*
     * permette l'aggiunta di un metodo alla classe referenziata da this.
     *
     * @param pub TRUE se il metodo è pubblico, FALSE se è privato
     * @param ret tipo di ritorno
     * @name nome del metodo
     * @args ArrayList dei tipi dei parametri formali del metodo. Deve essere istanziata
     *
     * @throws UnacceptableMethodException se il metodo, per qualche motivo, non può
     *              essere aggiunto alla classe referenziata da this
     */
    public void addMethod(boolean pub, Type ret, String name, ArrayList<Type> args) {
        Method m = new Method(pub, name, ret, args);
        if (superClass != null) //parto dalla superclasse diretta. Il controllo locale lo faccio dopo
        {
            superClass.checksOverriding(m);
        }
        Set<Method> s = methods.get(name);
        if (s == null) {
            s = new HashSet<Method>();
            s.add(m);
            methods.put(name, s);
            return;
        }
        if (s.contains(m)) {
            throw new UnacceptableMethodException();
        }
        s.add(m);
    }

    /*
     * verifica se non ci sono conflitti di overriding
     * con la firma del metodo m
     *
     * @param m metodo per il quale si vuole effettuare il
     *          check di overriding
     *
     * @throws VisibilityOverridingException se il check fallisce
     *          per un conflitto di visibilità
     * @throws ReturnTypeOverridingException se il check fallisce
     *          per un conflitto sul tipo di ritorno
     */
    private void checksOverriding(Method m) {
        Set<Method> l = methods.get(m.name);
        if (l == null) {
            return;
        }
        for (Method am : l) {
            if (am.equals(m)) {
                //verifica le visibilita'
                if ((am.isPublic) && (!m.isPublic)) {
                    throw new VisibilityOverridingException();
                }
                //verifica il tipo di ritorno
                if (!m.returnType.isSubtypeOf(am.returnType)) {
                    throw new ReturnTypeOverridingException();
                }
                //mi posso fermare percha' in una classe non ci possono essere altri
                //metodi con questa firma
                return;
            }
        }
        if (this != OBJECT) {
            superClass.checksOverriding(m);
        }
    }

    /*
     * restituisce una lista delle firme candidate per la chiamata
     * codificata negli argomenti
     *
     * @param isSameClass TRUE se la chiamata avviene nella stessa classe
     *          dove è definito il metodo, FALSE altrimenti
     * @param name nome del metodo
     * @param args ArrayList dei tipi degli argomenti della chiamata. Deve
     *              essere necessatiamente un ArrayList perché si necessita
     *              dell'accesso posizionale. Deve essere sempre istanziata
     * @return  lista delle firme candidate. Nel caso in cui non ce ne siano
     *          ritorna una lista vuota.
     *
     */
    private List<Method> getCandidateSignatures(boolean isSameClass, String name, ArrayList<Type> args) {
        List<Method> ret = new LinkedList<Method>();
        Set<Method> l = methods.get(name);
        if (l != null) {
            for (Method am : l) {
                if ((am.isPublic || isSameClass) && (am.isCompatibleWith(args))) {
                    ret.add(am);
                }
            }
        }
        if (this != OBJECT) {
            ret.addAll(superClass.getCandidateSignatures(false, name, args));
        }
        return ret;
    }


    /*
     * realizza la prima fase del binding: early-binding. Verifica, se esiste,
     * una firma più specifica delle alre, fra tutte quelle candidate a rispondere
     * alla chiamata codificata negli argomenti
     *
     * @param isSameClass TRUE se la chiamata avviene nella stessa classe
     *          dove è definito il metodo, FALSE altrimenti
     * @param name nome del metodo
     * @param args ArrayList dei tipi degli argomenti della chiamata. Deve
     *              essere necessatiamente un ArrayList perché si necessita
     *              dell'accesso posizionale. 
     * @return tipo di ritorno della firma candidata più specifica
     * @throws EarlyBindingException se non ci sono firme candidate, oppure
     *          se non esiste una firma candidata più specifica delle altre
     */
    public Type bindMethod(boolean isSameClass, String name, ArrayList<Type> args) {
        //genero la lista delle firme candidate
        //se c'è una firma più specifica delle altre ritorno.
        //altrimenti lancio un'eccezione
        args = (args == null) ? new ArrayList<Type>() : args;
        List<Method> candL = getCandidateSignatures(isSameClass, name, args);
        //OTTIMIZZAZIONI:
        //se la lista è vuota o ha un solo elemento siamo in un caso base
        //se è vuota, lancio un'eccezione
        //se c'è un elemento ritorno semplicemente
        if (candL.isEmpty()) {
            throw new EarlyBindingException(/*name,args*/);
        }
        if (candL.size() == 1) {
            return candL.get(0).returnType;
        }
        //CASO GENERICO:
        Method[] candA = (Method[]) candL.toArray();
        boolean[] skip = new boolean[candA.length];
        for (int i = 0; i < candA.length; i++) {
            if (skip[i]) {
                continue;
            }
            for (int j = 0; j < candA.length; j++) {
                //se I NON è più specifico di J allora sicuramente
                //non è la firma più specifica, quindi esco dall'iteratac
                //corrente
                if (!candA[i].isCompatibleWith(candA[j].arguments)) {
                    break;
                }
                //se I è più specifico di J allora J non deve essere
                //più considerabile come possibile firma più specifica
                //per questo verrà skippata dal for più esterno
                skip[j] = true;
                //condizione che esprime il test
                //di avvenuta ricerca di una firma più specifica delle altre
                if (j == (candA.length - 1)) {
                    return candA[i].returnType;
                }
            }
        }
        //se arrivo quà vuol dire che non è stata trovata alcuna firma
        //più specifica delle altre, quindi sollevo un'eccezione di Early Binding
        throw new EarlyBindingException(/*name,args*/);
    }

    //CAMPI
    private class Field {

        private Field(String n, Type t, boolean p) {
            name = n;
            type = t;
            isPublic = p;
        }

        /*
         * coerente con equals, quindi calcolato in base al
         * nome del campo
         *
         * @see equals(java.lang.Object)
         * @return hash-code di this
         */
        @Override
        public int hashCode() {
            return name.hashCode();
        }

        /*
         * due campi sono uguali se hanno lo stesso nome
         *
         * @param obj oggetto con il quale this verrà confrontato
         * @return TRUE se this è uguale ad obj, FALSE altrimenti
         */
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            final Field other = (Field) obj;
            return name.equals(other.name);
        }
        private final Type type;
        private final String name;
        private final boolean isPublic;
    }

    /*
     * aggiunge un campo alla classe
     *
     * @param n nome del campo
     * @param t tipo del campo
     * @param v visibilità del campo; TRUE se è pubblico, FALSE se è privato
     *
     * @throws UnacceptableFieldException se esiste già, nella classe, un campo
     *              con lo stesso nome di this
     */
    public void addField(String n, Type t, boolean v) {
        Field f = fields.get(n);
        if (f != null) {
            throw new UnacceptableFieldException();
        }
        f = new Field(n, t, v);
        fields.put(n, f);
    }

    /*
     *    COSTRUTTORI:
     *    un costruttore è iterabile sul tipo dei suoi parametri
     * 
     */
    private class Constructor implements Iterable<Type> {

        private Constructor(boolean b, List<Type> a) {
            arguments = a;
            isPublic = b;
        }

        /*
         * il codice è generato in base alla lista dei tipi
         * degli argomenti, tenendo conto anche del
         * loro ordine. E' coerente con equals.
         *
         * @see equals(java.lang.Object)
         * @return l'hash-code del costruttore this
         */
        @Override
        public int hashCode() {
            int res = 0;
            int pos = 1;
            for (Type t : arguments) {
                res ^= t.hashCode();
                //hashcode deve tenere presente la posizione del parametro!
                //shiftiamo circolarmente in base alla posizione
                res = (res >> pos) | (res << (32 - pos));
                pos++;
            }
            return res;
        }

        /*
         * il criterio di uguaglianza consiste nel confrontare le liste dei tipi:
         * queste devono avere stessi tipi negli stessi posti, affinché i
         * costruttori siano uguali
         *
         * @param x riferimento all'oggetto da confrontare
         * @return  true se i due costruttori sono uguali
         */
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Constructor)) {
                return false;
            }
            Constructor c = (Constructor) obj;
            // controllo costruttore senza argomenti
            if (c.arguments.isEmpty()) {
                return (this.arguments.isEmpty());
            }

            if (c.arguments.size() != this.arguments.size()) {
                return false;
            }

            int i = 0;
            for (Type t : c) {
                if (!t.equals(arguments.get(i++))) {
                    return false;
                }
            }
            return true;
        }

        public Iterator<Type> iterator() {
            return arguments.iterator();
        }

        /*
         * verifica se il costruttore this è compatibile con la chiamata call.
         *
         * @param call ArrayList dei tipi degli argomenti della chiamata.
         *              Deve essere un'ArrayList perché si necessita dell'accesso posizionale.
         *              Inoltre call deve essere istanziata.
         * @return TRUE se il costruttore this è compatibile con la chiamata call. FALSE altrimenti
         */
        private boolean isCompatibleWith(List<Type> call) {
            if (call.isEmpty()) {
                return (arguments.isEmpty());
            }

            if (call.size() != arguments.size()) {
                return false;
            }

            int i = 0;
            for (Type t : call) {
                if (!t.isAssignableTo(arguments.get(i++))) {
                    return false;
                }
            }
            return true;
        }
        private final boolean isPublic;
        private List<Type> arguments;
    }

    /*
     * aggiunge un costruttore alla classe referenziata da this
     *
     * @param v visibilità; TRUE se il costruttore è pubblico, FALSE se privato
     * @param a lista dei tipi dei parametri formali del costruttore da aggiungere
     *
     * @throws UnacceptableConstructorException se è impossibile aggiungere
     *          il costtruttore, perché ne esiste già un altro la cui firma
     *          genera un conflitto
     */
    public void addConstructor(boolean v, List<Type> a) {
        Constructor c = new Constructor(v, a);
        if (constructors.contains(c)) {
            throw new UnacceptableConstructorException();
        }
        constructors.add(c);
    }

    /*
     * verifica che la chiamata call sia associabile ad uno
     * dei costruttori associati alla classe referenziata da this.
     * Lancia un'eccezione se ciò non accade.
     *
     * @param call lista dei tipi dei parametri della chiamata
     *
     * @throws EarlyBindingException se non c'è nessun metodo
     *          associabile alla chiamata call
     */
    public void bindConstructor(List<Type> call) {
        call = (call == null) ? new ArrayList<Type>() : call;
        // Costruttore implicito di default
        if (constructors.isEmpty()) {
            if (call.isEmpty()) {
                return;
            } else {
                throw new EarlyBindingException(/*name,args*/);
            }
        }
        for (Constructor c : constructors) {
            if (c.isCompatibleWith(call)) {
                return;
            }
        }
        throw new EarlyBindingException(/*name,args*/);
    }

    @Override
    public String toString() {
        return name;
    }
    private final String name;
    private ReferenceType superClass;
    private Map<String, Set<Method>> methods;
    private Map<String, Field> fields;
    private List<Constructor> constructors;
    //i referenceType di String ed Object hanno particolare dignita',
    //quindi divengono delle costanti di classe
    public static final ReferenceType OBJECT;
    public static final ReferenceType STRING;
    public static final ReferenceType CLASS;

    static {
        OBJECT = new ReferenceType("Object");
        STRING = new ReferenceType("String");
        STRING.addSuperType(OBJECT);
        CLASS = new ReferenceType("Class");
        CLASS.addSuperType(OBJECT);
    }
}
