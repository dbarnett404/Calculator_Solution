import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final String [] operators = {"+", "-", "*", "integer divide", "double divide", "square", "cube", "is even", "is prime", "quit"};
    private static final int ADD = 0;
    private static final int SUBTRACT = 1;
    private static final int MULTIPLY = 2;
    private static final int  INT_DIV = 3;
    private static final int  DOUBLE_DIV = 4;
    private static final int SQUARE = 5;
    private static final int CUBE = 6;
    private static final int EVEN = 7;
    private static final int PRIME = 8;
    private static final int QUIT =9 ;
    /**
     * Uses theOperands class to get two doubles
     * @return the two operands (doubles)
     */
    private static Operands getOperands() {
        Operands currentOperands = new Operands();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        currentOperands.setNum1(sc.nextDouble());
        System.out.println("Enter second number: ");
        currentOperands.setNum2(sc.nextDouble());
        return currentOperands;
    }

    /**
     * Returns a double
     * @return the operand (double)
     */
    private static double getOperand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        return sc.nextDouble();
    }
    /**
     * Prints out all operators plus q
     * @return user selection (lower case)
     */
    private static int getMenuChoice() {
        System.out.println("Select number to choose an operation:");
        for (int i = 0; i < operators.length; i++) {
            System.out.println(i + ": " + operators[i]);
        }
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Just 'holds' the output window so you can see the result before the menu'
     */
    private static void pause() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press any key to continue");
        sc.nextLine();
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###");
        System.out.println("Calculator program");
        Calculator calc = new Calculator();
        int choice = -1;
        double result = 0;
        while (!(choice == QUIT)){
            choice = getMenuChoice();
            //Handle all operations that require two operands
            if (choice >= ADD && choice <= DOUBLE_DIV) {
                Operands currentOperands = getOperands();
                double num1 = currentOperands.getNum1();
                double num2 = currentOperands.getNum2();
                switch (choice) {
                    case ADD:
                        result = calc.addTwoNumbers(num1, num2);
                        break;
                    case SUBTRACT:
                        result = calc.subtractTwoNumbers(num1, num2);
                        break;
                    case MULTIPLY:
                        result = calc.multiplyTwoNumbers(num1, num2);
                        break;
                    case INT_DIV:
                        //As it's int's this is an exception!
                        System.out.println((int)num1 + " " + operators[choice] + " "
                                + (int)num2 + " = " +calc.intDivideNumbers((int)num1, (int)num2));
                        break;
                    case DOUBLE_DIV:
                        result = calc.doubleDivideNumbers(num1, num2);
                        break;
                }
                if (choice != INT_DIV)
                    System.out.println(num1 + " " + operators[choice] + " " + num2 + " = " + result);
            } else if (choice < QUIT) {
                //Handle all operations that require a single operand
                double num = getOperand();
                `switch (choice) {
                    case SQUARE:
                        System.out.println(operators[choice] + ": "  + num + " = "
                                +  calc.squareNumber(num));
                        break;
                    case CUBE:
                        System.out.println(operators[choice] + ": "  + num + " = "
                                +  calc.cubeNumber(num));
                        break;
                    case EVEN:
                        System.out.println(operators[choice] + ": "  + num + " = "
                                +  calc.isEven(num));
                        break;
                    case PRIME:
                        System.out.println(operators[choice] + ": " + num + " = "
                                +  calc.isPrime((int)num));
                        break;
                }
            }
            if (choice != QUIT)
                pause();
        }
    }
}
