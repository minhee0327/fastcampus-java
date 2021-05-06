package chapter05.ch03;


public class Node {
    private String data;
    public Node next;

    Node(){
        this.data = null;
        this.next = null;
    }

    Node(String data){
        this.data = data;
        this.next = null;
    }

    Node(String data, Node next){
        this.data = data;
        this.next = next;
    }

    public String getData(){
        return this.data;
    }
}


