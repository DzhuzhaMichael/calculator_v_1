public class Calculator {
    double firstOperand;
    double secondOperand;

    public Calculator (double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public double add() {
        return firstOperand + secondOperand;
    }

    public double subtract() {
        return firstOperand - secondOperand;
    }

    public double multiply() {
        return firstOperand * secondOperand;
    }

    public double divide() {
        return firstOperand / secondOperand;
    }
}
