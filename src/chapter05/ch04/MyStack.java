package chapter05.ch04;

import chapter05.ch02.MyArray;

//구현했던 Array 사용해서 구현하기.

public class MyStack {
    int top;
    MyArray arrayStack;

    MyStack(){
        arrayStack = new MyArray();
        this.top = 0;
    }

    MyStack(int size){
        arrayStack = new MyArray(size);
        this.top = 0;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek(){
        if(top == 0){
            System.out.println("Stack is Empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(top-1);
    }

    public int getSize(){
        return top;
    }

    public boolean isFull(){
        return top>=arrayStack.ARRAY_SIZE;
    }

    public void printAll(){
        arrayStack.printAll();
    }

    public boolean isEmpty(){
        return top == 0;
    }
}
