package chapter05.ch03;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.isEmpty());

        list.addElements("1");
        list.addElements("2");
        list.addElements("3");
        list.addElements("4");
        list.addElements("5");

        list.printAll();
        System.out.println("---");
        list.insertElement(1, "1.5");
        list.printAll();
        System.out.println("---");
        list.removeElement(0);
        list.insertElement(0, "1");
        list.printAll();
        System.out.println("---");
        System.out.println(list.getElement(0));
        System.out.println(list.getNode(5).getData());

        System.out.println(list.isEmpty());
        list.removeAll();
        System.out.println(list.isEmpty());

        //혼자 구현 했는데, 풀이 보고오겠음.
    }
}
