package chapter02.ch18;

public class Company {
    private static Company instance = new Company();

    //외부에서 생성을 마음대로 생성할 수 없도록 private
    private Company(){}

    public static Company getInstance(){
        //최초 생성이 안되었다면 생성해주도록 방어코드
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

}
