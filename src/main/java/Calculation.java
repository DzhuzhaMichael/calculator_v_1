public class Calculation {
    public static void main(String[] args) {

        // Test comment from Github_2
        // Test commit from IDEA
        // Test comment from Github_3
        
        System.out.println("Welcome to the Calculator_version_1! \nThe Calculator provides opportunity to add," +
                        " subtract, multiply or divide two operands.");

        Converter converter = new Converter();

        System.out.print("Please, enter FIRST operand (arabic or roman): ");
        double firstOperand = converter.getValue();

        System.out.print("Please, enter SECOND operand (arabic or roman): ");
        double secondOperand = converter.getValue();

        System.out.print("Please, choose operation sign (+, -, *, /): ");
        String operationSign = converter.getOperationSign();

        double result = 0;

        Calculator calculator = new Calculator(firstOperand, secondOperand);

        switch (operationSign) {
            case "+": {
                result = calculator.add();
                break;
            }
            case "-": {
                result = calculator.subtract();
                break;
            }
            case "*": {
                result = calculator.multiply();
                break;
            }
            case "/": {
                if (secondOperand == 0) {
                    System.out.print("Division by zero is not possible.");
                    break;
                } else {
                    result = calculator.divide();
                    break;
                }
            }
        }

        System.out.println(firstOperand + " " + operationSign + " " + secondOperand + " " + "=" + " " + result);
    }
}
