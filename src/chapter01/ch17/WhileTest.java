package chapter01.ch17;

public class WhileTest {
    public static void main(String[] args) {
        //지역변수는 되도록 초기화에 신경 쓸 것
        int num = 1;
        int sum = 0;

        while(num <= 10){
            sum += num;
            num++;
        }

        System.out.println(sum);
        System.out.println(num);
    }
}
