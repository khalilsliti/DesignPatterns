import templatemethod.ExcelProcessor;
import templatemethod.TextProcessor;


public class Main {
    public static void main(String[] args) {
/*   Singleton design pattern
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1.hashCode()+" logger 1 hashcode");
        System.out.println(logger1.hashCode()+" logger 2 hashcode");

 */

        /* Factory Design pattern
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the first number");
        Integer num1 =  scanner.nextInt();
        System.out.println("Give me the second number");
        Integer num2 =  scanner.nextInt();
        System.out.println("Give me the type of operation");
        String type = scanner.next();
        CalculateFactory factory = new CalculateFactory();
        Calculate calculate = factory.getCalculation(type);
        calculate.calculate(num1,num2);

 */


        ExcelProcessor excelProcessor = new ExcelProcessor();
        excelProcessor.readProcessSaveData();
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.readProcessSaveData();


    }
}