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
public class MyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LinkedListNode list_1 = new LinkedListNode(3, new LinkedListNode(1, new LinkedListNode(5)));
        System.out.println(list_1);
        
        LinkedListNode list_2 = new LinkedListNode(5, new LinkedListNode(9, new LinkedListNode(2)));
        System.out.println(list_2);
        
        LinkedListNode listResult = Sum(list_1, list_2, 0);
        System.out.println(listResult);
    
    }

    public static LinkedListNode Sum(LinkedListNode node_1, LinkedListNode node_2, Integer i) {
        if (node_1.hasNext()) {
            Integer result = node_1.getData() + node_2.getData() + i;
            if (result > 9) {
                i = 1;
            } else {
                i = 0;
            }
            return new LinkedListNode(result % 10, Sum(node_1.next(), node_2.next(), i));
        } else {
            Integer result = node_1.getData() + node_2.getData() + i;
            return new LinkedListNode(result % 10);
        }
    }

}
