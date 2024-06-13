package com.prg.linkedList;

public class LinkedListCustomDemo {
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.addNodeAtLastUsingHead(10);
        linkedList.addNodeAtLastUsingHead(20);
        linkedList.addNodeAtLastUsingHead(30);
        linkedList.addNodeAtLastUsingHead(40);
        linkedList.displayLL();
        LinkedList linkedList2= new LinkedList();
        linkedList2.addNodeAtLastUsingTail(10);
        linkedList2.addNodeAtLastUsingTail(20);
        linkedList2.addNodeAtLastUsingTail(30);
        linkedList2.addNodeAtLastUsingTail(40);
        linkedList2.displayLL();
        System.out.printf("likedlist2 size: %d \n",linkedList2.getSize());
        linkedList2.addNodeAtGivenIndex(50,0);
        System.out.println("addNodeAtGivenIndex->0");
        linkedList2.displayLL();
        System.out.printf("likedlist2 size: %d after adding element at index 0 \n", linkedList2.getSize());
        LinkedList linkedList3= new LinkedList();
        linkedList3.addNodeAtGivenIndex(10, 0);
        linkedList3.displayLL();
        linkedList3.addNodeAtGivenIndex(20,1);
        linkedList3.displayLL();
        linkedList3.addNodeAtGivenIndex(11,1);
        linkedList3.displayLL();
        linkedList3.addAtStartOfNode(5);
        linkedList3.displayLL();
        linkedList3.removeFirstNode();
        linkedList3.displayLL();
        linkedList3.removeFirstNode();
        linkedList3.displayLL();
        linkedList3.removeFirstNode();
        linkedList3.displayLL();
        linkedList3.removeFirstNode();
        linkedList3.displayLL();

        linkedList3.addNodeAtGivenIndex(10, 0);
        linkedList3.displayLL();
        linkedList3.addNodeAtGivenIndex(20,1);
        linkedList3.displayLL();
        linkedList3.addNodeAtGivenIndex(11,1);
        linkedList3.displayLL();
        linkedList3.removeLastNode();
        linkedList3.displayLL();
        linkedList3.addNodeAtLastUsingTail(90);
        linkedList3.displayLL();
        linkedList3.removeNodeAtGivenIndex(1);
        linkedList3.displayLL();
    }
}
