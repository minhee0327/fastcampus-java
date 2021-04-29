package chapter02.ch11;

public class MakeReportTest {
    public static void main(String[] args) {
        MakeReport makeReport = new MakeReport();

        String report  = makeReport.getReport();

        System.out.println(report);
    }
}
