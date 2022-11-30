package templatemethod;

public class TextProcessor extends DataProcessor {
    @Override
    public void readData()
    {
        System.out.println("reading text data");
    }

    @Override
    public void processData() {
        System.out.println("processing text data");
    }
}
