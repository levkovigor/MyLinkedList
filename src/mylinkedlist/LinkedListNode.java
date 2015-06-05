/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author igor
 */
public class LinkedListNode {

    LinkedListNode next = null;
    Integer data = null;

    public LinkedListNode(Integer data) {
        this.data = data;
    }

    public LinkedListNode(Integer data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public boolean hasNext() {
        if (next == null) {
            return false;
        } else {
            return true;
        }
    }

    public LinkedListNode next() {
        return this.next;
    }

    public Integer getData() {
        return this.data;
    }

    public String toString() {
        String out = this.data.toString();
        if (this.next != null) {
            out += "->"+this.next.toString();
        }
        return out;
    }

}
