package chapter02.ch11;

public class MakeReport {
    StringBuffer sb = new StringBuffer();

    private String line = "===========================================\n";
    private String title = "  이름\t   주소 \t\t  전화번호  \n";

    public void makeHeader(){
        sb.append(line);
        sb.append(title);
        sb.append(line);
    }

    public void makeBody(){
        sb.append("James \t");
        sb.append("Seoul Korea \t");
        sb.append("010-2222-3333\n");

        sb.append("Tomas \t");
        sb.append("NewYork US \t");
        sb.append("010-7777-0987\n");
    }

    public void makeFooter(){
        sb.append(line);
    }

    public String getReport(){
        makeHeader();
        makeBody();
        makeFooter();
        return sb.toString();
    }

}
