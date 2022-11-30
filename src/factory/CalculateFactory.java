package factory;

public class CalculateFactory {

    public Calculate getCalculation(String type) {
        Calculate calculate = null;
        if (type.toLowerCase().equals("add")) {
            calculate = new Add();

        } else if (type.toLowerCase().equals("multiply")) {
            calculate = new Multiply();
        } else if (type.toLowerCase().equals("substract")) {
            calculate = new Substract();
        }

        return calculate;
    }
}
