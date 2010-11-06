package jagrammar.util;

import java.util.LinkedList;

/**
 * Rappresenta una lista che non ammette duplicati
 *
 * @author Gerardo Adelizzi
 */
public class LinkedSetList<T> extends LinkedList<T> {

    @Override
    public boolean add(T e) {
        if (!contains(e)) {
            return super.add(e);
        }
        return false;
    }
}
