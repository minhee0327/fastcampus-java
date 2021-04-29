package chapter02.ch03;

public class FunctionTest {
    public static int addNum(int num1, int num2){
        int ret;
        ret = num1 + num2;
        return ret;
    }

    public static void sayHello(String name){
        System.out.println("hello " + name +" ~~ !");
    }

    public static int calcSum(){
        int sum = 0;
        int i;

        for(i = 0; i  <= 100; i++){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("minhee");

        total = calcSum();
        System.out.println(calcSum());
    }
}
