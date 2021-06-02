package chapter05.ch05;

public class QueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");

        queue.printQueue();

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
