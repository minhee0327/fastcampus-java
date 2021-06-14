package chapter06.ch10;

//Illegal Exception => run time exception (: 컴파일러 디텍션이 안될 수 있음)
public class PassWordException extends Exception{
    public PassWordException(String message){
        super(message);
    }
}
