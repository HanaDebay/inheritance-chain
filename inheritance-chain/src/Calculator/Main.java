package Calculator;

//1- Create 'Calculator' interface. in this interface there should be 4 functions: Sum, Subtract, Multiply, Divide.
//implement this interface from 'CalculatorClass' and implement necessary functions.
//All the classes and interface and main function should be in separate files.

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new calculatorClass();
        System.out.println(calculator.sum(20,6));
        System.out.println(calculator.sub(20,6));
        System.out.println(calculator.mul(20,6));
        System.out.println(calculator.div(20,6));
    }
}

