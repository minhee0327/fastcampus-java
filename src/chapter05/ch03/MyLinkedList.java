package chapter05.ch03;

public class MyLinkedList {
    private Node head;
    int count;

    public MyLinkedList(){
        this.head = null;
        this.count = 0;
    }

    public void addElements(String data){
        Node curNode = new Node(data);
        if(count == 0){
            head = curNode;
        }else{
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = curNode;
        }
        count++;
    }

    public void insertElement(int position, String data){
        Node curNode = new Node(data);
        if(position<0 || position>= count){
            System.out.println("Error: Can't insert Element");
            return;
        }
        if(position == 0){
            curNode.next = head;
            head = curNode;
        }else{
            Node nxtNode = head;
            Node prevNode = null;
            while(position>0){
                prevNode = nxtNode;
                nxtNode = nxtNode.next;
                position--;
            }
            prevNode.next = curNode;
            curNode.next = nxtNode;
        }
        count++;
    }


    public void removeElement(int position){
        Node nxtNode = head;
        Node prevNode = null;

        if(position<0 || position>=count){
            System.out.println("Index Out of Range Error");
            return;
        }

        if(position==0){
            head = head.next;
            return;
        }
        while(position>0){
            prevNode = nxtNode;
            nxtNode = nxtNode.next;
            position--;
        }

        prevNode.next = nxtNode.next;
        count--;
    }

    public void printAll(){
        Node node  = head;
        while(node != null){
            System.out.print(node.getData());
            node = node.next;
            if(node!= null){
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public String getElement(int position){
        if(position>= count){
            System.out.println("Index Out of Range. current List size is..: " + getSize() );
            return "Error";
        }
        if(position== 0){
            return head.getData();
        }else{
            Node curNode = head;
            while(position>0){
                curNode = curNode.next;
                position--;
            }
            return curNode.getData();
        }
    }

    public int getSize(){
        return count;
    }

    public Node getNode(int position){
        if(position<0 || position>=count){
            System.out.println("현재 크기: " + getSize());
            return null;
        }
        if(position==0){
            return head;
        }else{
            Node curNode = head;
            while(position>0){
                curNode = curNode.next;
                position--;
            }
            return curNode;
        }
    }

    public void removeAll(){
        head = null;
        count = 0;
    }

    public boolean isEmpty(){
        return count<=0;
    }
}
