package chapter06.ch01;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Runnable r = outer3.getRunnable(100);
        r.run();
        System.out.println();
        outer3.runnable.run();
    }
}

class Outer3{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){
        int num = 10;
        //익명 inner class (class 이름이 필요 없으니까)
        return new Runnable(){
            int localNum = 100;

            @Override
            public void run() {

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum" + outNum +"외부 클래스 인스턴스 변수");
                System.out.println("Outer.sNum" + Outer2.sNum +"(외부 클래스 스태틱 변수)");
            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}


