/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqheap;

/**
 *
 * @author simon
 */
public class Element {

    private int key; // parrent 
    private Object data; 

    public Element(int i, Object o) {
        this.key = i;
        this.data = o;
    }

    public int getKey() {
        return this.key;
    }

    public Object getData() {
        return this.data;
    }

}
