package calculator;

public class Calculator {

    private static double OperandOne;
    private static double OperandTwo;
    private static String Operation;
    private double result;

    public static double getOperandOne() {
        return OperandOne;
    }

    public static void setOperation(String Operation) {
        Calculator.Operation = Operation;
    }

    public static double getOperandTwo() {
        return OperandTwo;
    }

    public static void setOperandOne(double OperandOne) {
        Calculator.OperandOne = OperandOne;
    }

    public static void setOperandTwo(double OperandTwo) {
        Calculator.OperandTwo = OperandTwo;
    }

    public void performOperation() {
        switch (Operation) {
            case "+":
                result = OperandOne + OperandTwo;

                break;
            case "-":
                result = OperandOne - OperandTwo;
                break;
            case "*":
                result = OperandOne * OperandTwo;
                break;
            case "/":
                try {
                    result = OperandOne / OperandTwo;
                } catch (Exception e) {
                }
                break;
            default:
                result = 0;
        }

    }

    public double getResults() {
        return result;

    }

}
