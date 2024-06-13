package com.prg.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addAtStartOfNode(int value) {
        Node node = new Node(value);
        /**
         * for first element head=tail==null
         */
        node.next = head; //node.next=null for first element
        head = node; //now head is pointing to first element
        if (tail == null) { //while inserting first element head and tail both will be null since no node is there
            tail = head; // now after first node inserted both head and tail will point to the first node
        }
        size += 1;
    }

    public void addNodeAtLastUsingTail(int value) {
        Node node = new Node(value);
        if (head == null && tail == null) {
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size +=1;
    }

    public void addNodeAtLastUsingHead(int value) {
        Node node = new Node(value);
        if (head == null && tail == null) {
            head = node;
            tail = node;
        }else {
            Node temp= head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next = node;
            tail = node;
        }
        size +=1;
    }

    public void addNodeAtGivenIndex(int value, int index){
        if(index==0){
            Node node= new Node(value);
            node.next=head;
            head=node;
            if(tail==null)
                tail=head;
            size +=1;
        } else if(index==size){
            Node node = new Node(value);
            tail.next=node;
            tail=node;
            size +=1;
        } else {
            Node temp=head;
            for(int i=1; i< index; i++){ //intent of loop is reached to one position prior to index
                temp= temp.next;
            }
            Node node= new Node(value, temp.next);
            temp.next= node;
            size +=1;
        }
    }
    public int removeFirstNode(){ //this method will give NullPointerException when no element is there
                        //kept this functionality intentionally we can avoid using if(size>0)
        int value= head.value;
        head= head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int removeLastNode(){
        Node temp= head;
        int value= temp.value;
        for(int i=1; i< size-1; i++){
            temp= temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
        return value;
    }
    public int removeNodeAtGivenIndex(int index){
        if(index==0){
            return removeFirstNode();
        }
        if(index == size-1){
            return removeLastNode();
        }
        Node node = getNode(index);
        int value= node.next.value;
        node.next= node.next.next;
        size--;
        return value;
    }
    public Node getNode(int index){
        Node node=head;
        if(index>=0 && index<size){
            for(int i=1; i< index; i++){
                node=  node.next;
            }
            return node;
        }
        return null;
    }

    public void displayLL() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
