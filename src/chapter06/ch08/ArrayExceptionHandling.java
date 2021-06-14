package chapter06.ch08;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            for (int i = 0; i <= arr.length;i++){
                System.out.println(arr[i]);;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());  //exception full name + message
        }
        System.out.println("비정상 종료되지 않았습니다.");
    }
}