package com.prg.doublyLinkedList;

public class Demo {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList= new DoublyLinkedList();
        doublyLinkedList.insertFirstElement(10);
        doublyLinkedList.display();
        doublyLinkedList.insertLastElement(20);
        doublyLinkedList.display();
        doublyLinkedList.insertFirstElement(5);
        doublyLinkedList.display();
        doublyLinkedList.insertLastElement(25);
        doublyLinkedList.display();
        doublyLinkedList.insertFirstElement(1);
        doublyLinkedList.display();
        doublyLinkedList.insertLastElement(30);
        doublyLinkedList.display();

        doublyLinkedList.displayUsingTail();
        doublyLinkedList.insertElementAtGivenIndex(2,7777);
        doublyLinkedList.display();
    }
}
