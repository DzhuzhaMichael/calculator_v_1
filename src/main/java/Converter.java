import java.util.Scanner;

public class Converter {
    Scanner input = new Scanner(System.in);

    public double getValue() {
        double value = 0;
        String userInput = input.next().toUpperCase(); // fails with incorrect values like "3r" or

        if (userInput.charAt(0) == '0' || userInput.charAt(0) == '1' || userInput.charAt(0) == '2'
                || userInput.charAt(0) == '3' || userInput.charAt(0) == '4' || userInput.charAt(0) == '5'
                || userInput.charAt(0) == '6' || userInput.charAt(0) == '7' || userInput.charAt(0) == '8'
                || userInput.charAt(0) == '9') {
            value = Double.parseDouble(userInput); // fails here
        } else if (userInput.contains("I") || userInput.contains("V") || userInput.contains("X")
                || userInput.contains("L") || userInput.contains("C") || userInput.contains("D")
                || userInput.contains("M")) {
            value = getArabicValue(userInput);
        } else {
            System.out.print("Incorrect input. Please, try again.\nCorrect value: ");
            value = getValue();
        }
        return value;
    }

    public double getArabicValue(String userInput) {
        double arabicValue = 0;
        double lastValue = 0;
        double lastProcessValue = 0;

        for (int i = userInput.length() - 1; i >= 0; i--) {
            switch (userInput.charAt(i)) {
                case 'M':
                    lastValue = 1000;
                    break;
                case 'D':
                    lastValue = 500;
                    break;
                case 'C':
                    lastValue = 100;
                    break;
                case 'L':
                    lastValue = 50;
                    break;
                case 'X':
                    lastValue = 10;
                    break;
                case 'V':
                    lastValue = 5;
                    break;
                case 'I':
                    lastValue = 1;
                    break;
            }
            if (lastProcessValue > lastValue) {
                arabicValue -= lastValue;
            } else {
                arabicValue += lastValue;
            }
            lastProcessValue = lastValue;
        }
        return arabicValue;
    }

    public String getOperationSign() {
        String operationSign = input.next();
        if (operationSign.equals("+") || operationSign.equals("-") || operationSign.equals("*")
                || operationSign.equals("/")) {
            return operationSign;
        } else {
            System.out.print("Invalid operation sign. \nPlease, select operation (+, -, *, /): ");
            operationSign = getOperationSign();
        }
        return operationSign;
    }
}