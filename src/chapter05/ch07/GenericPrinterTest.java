package chapter05.ch07;


public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder= new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());

//        <> 명시하지 않으면 Object (따라서 적절한 형변환 필요)
//        GenericPrinter powderPrinter2 = new GenericPrinter<>();
//        powderPrinter2.setMaterial(powder);
//        Powder p2 = (Powder) powderPrinter2.getMaterial();


    }
}
