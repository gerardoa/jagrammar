/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jagrammar.util;

import java.util.LinkedList;

/**
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

    public static void main(String[] args) {
        LinkedSetList<Variable> lv = new  LinkedSetList<Variable>();
        lv.add(new Variable("i", null));
        String s = "i";
        System.out.println(""+lv.contains(new Variable(s, null)));
    }
}
