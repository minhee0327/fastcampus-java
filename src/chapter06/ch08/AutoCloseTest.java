package chapter06.ch08;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseableObj obj = new AutoCloseableObj();

        try(obj) {
            //강제로 exception 생성 시켜봄.
            throw new Exception();
        }catch (Exception e){
            System.out.println("exception..");
        }

        System.out.println("end");
    }
}
