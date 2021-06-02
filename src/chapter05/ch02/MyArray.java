package chapter05.ch02;

import java.util.Arrays;

public class MyArray {
    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public void addElement(int num){
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
        }else{
            intArr[count++] = num;
        }
    }

    public void insertElement(int position, int num){
        if(count > ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        if(position < 0 || position> count){
            System.out.println("Error");
            return;
        }
        for(int i = count-1; i >= position; i--){
            intArr[i+1] = intArr[i];
        }
        intArr[position] = num;
        count++;
    }

    public int removeElement(int position){
        int ret = ERROR_NUM;
        if(position <0 || position>count){
            System.out.println("Index out or Range Error");
            return ret;
        }
        if(isEmpty()){
            System.out.println("Can't remove Array. There is no element");
            return ret;
        }
        //이동하기 전 return 값 저장
        ret = intArr[position];
        //이동
        for(int i = position; i < count-1; i++){
            intArr[i] = intArr[i+1];
        }
        return ret;
    }

    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        return count <= 0;
    }

    public int getElement(int position){
        if(position<0 || position> count){
            System.out.println("Index Outof Range. 현재 리스트 개수: " + count);
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll(){
        if(count == 0){
            System.out.println("비어있습니다.");
            return;
        }
        for(int i: intArr){
            System.out.print(i +" ");
        }
        System.out.println();
    }

    public void removeAll(){
        Arrays.fill(intArr, 0);
        count = 0;
    }
}
