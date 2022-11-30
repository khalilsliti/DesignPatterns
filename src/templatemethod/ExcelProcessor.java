package templatemethod;

public class ExcelProcessor extends DataProcessor {
    @Override
    public void readData()
    {
        System.out.println("reading excel data");
    }

    @Override
    public void processData() {
        System.out.println("processing excel data");
    }


}
