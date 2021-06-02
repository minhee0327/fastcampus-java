package chapter05.ch05;

import chapter05.ch03.MyLinkedList;
import chapter05.ch03.Node;

interface IQueue{
    public void enQueue(String data);
    public String deQueue();
    public void printQueue();
}
public class MyQueue extends MyLinkedList implements  IQueue{
    Node front;
    Node rear;

    MyQueue(){
        front = null;
        rear = null;
    }
    @Override
    public void enQueue(String data) {
        Node newNode;
        if(isEmpty()){
            newNode = addElements(data);
            front = newNode;
            rear = newNode;
        }else{
            newNode= addElements(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() +" added");
    }

    @Override
    public String deQueue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        String data = front.getData();
        front = front.next;

        if(front == null){
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {
        printAll();
    }
}
