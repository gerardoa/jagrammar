/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar.util;

import java.util.LinkedList;

/**
 *
 * @author IlianaPetrova
 */
public class LinkedSetList extends LinkedList<String> {

    @Override
    public boolean add(String e) {
        if (!contains(e)) {
            return super.add(e);
        }
        return false;
    }
}
