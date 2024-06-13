package com.prg.doublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    private class Node{
        private int value;
        private Node previous;
        private Node next;
        Node(int value){
            this.value= value;
        }
        Node(int value, Node previous, Node next){
            this.value= value;
            this.previous= previous;
            this.next= next;
        }
    }
    public void insertFirstElement(int value){
        Node node;
        if(head==null && tail==null){
            node= new Node(value, null, null);
            head=tail=node;
        }else{
            node = new Node(value, null, head);
            head.previous= node;
            head=node;
        }
        size++;
    }
    public void insertElementAtGivenIndex(int index, int value){
        Node temp= getNode(index);
        System.out.println("Value for Node at index:"+index+" is "+temp.value);
        Node node= new Node(value, temp.previous, temp);
        temp.previous.next=node;
        temp.previous=node;
        size++;
    }
    public  Node getNode(int index){
        // 2=3=4=5
        Node node= head;
        for(int i=0; i< index; i++){
            node= node.next;
        }
        return node;
    }
    public void insertLastElement(int value){
        Node node= new Node(value, tail, null);
        tail.next=node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp= head;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
        System.out.println("END");
    }
    public void displayUsingTail(){
        Node temp= tail;
        while (temp != null){
            System.out.print(temp.value+"->");
            temp= temp.previous;
        }
        System.out.println("START");
    }
}
