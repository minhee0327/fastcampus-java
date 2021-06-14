package chapter06.ch01;

public class LocalInnerClassTest {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Runnable r = outer2.getRunnable(100);

        r.run();
    }
}

class Outer2{
    //member 변수에서 초기화하는 게 좋은건 아니지만, 강의상 (빠르게) 진행
    int outNum = 100;
    static int sNum = 200;

    // class 의 thread 화
    Runnable getRunnable(final int i){
        final int num = 10;
        class MyRunnable implements Runnable{
            int localNum = 100;

            @Override
            public void run() {
                /* inner class 에서 외부 지역변수, 매개변수 사용시 상수화 된다는 점(read only) 주의 */
                //i: stack memory 에서 메서드 호출 후 끝이 나면 없어짐.
                //run() 이라는 메서드는 언제든 다시 호출이 될 수 있음. 그래서 i 가 사라진 후 i 를 찾는 꼴이 됨.
                //이런 경우를 방지하고자 i와 같은 경우엔 내부적으로 final 처리를 한다.
//                i = 500;
                //num 도 마찬가
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum" + outNum +"외부 클래스 인스턴스 변수");
                System.out.println("Outer.sNum" + Outer2.sNum +"(외부 클래스 스태틱 변수)");
            }
        }
        return new MyRunnable();
    }
}


