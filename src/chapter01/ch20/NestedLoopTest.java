package chapter01.ch20;

public class NestedLoopTest {
    public static void main(String[] args) {
        int dan = 2;
        int count = 1 ;

        for( ; dan <10; dan++){
            for(count = 1; count< 10; count++){
                System.out.printf("%d * %d = %d\n", dan, count, dan*count );
            }
            System.out.println();
        }

        dan = 2;
        while(dan <10){
            count = 1;
            while(count < 10){
                System.out.printf("%d * %d = %d\n", dan, count, dan*count );
                count++;
            }
            System.out.println();
            dan++;
        }
    }
}
