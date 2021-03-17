public class Calculator {
    /**
     * Adds two numbers!
     * @param num1 first operand
     * @param num2 second operand
     * @return result
     */
    public double addTwoNumbers(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two numbers!
     * @param num1 first operand
     * @param num2 second operand
     * @return result
     */
    public double subtractTwoNumbers(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers!
     * @param num1 first operand
     * @param num2 second operand
     * @return result
     */
    public double multiplyTwoNumbers(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides two integers!
     * @param num1 first operand
     * @param num2 second operand
     * @return result
     */
    public int intDivideNumbers(int num1, int num2) {
        return num1 / num2;
    }

    /**
     * Divides two doubles!
     * @param num1 first operand
     * @param num2 second operand
     * @return result
     */

    public double doubleDivideNumbers(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * Squares a single double
     * @param num
     * @return
     */
    public double squareNumber(double num) {
        return num * num;
    }

    /**
     * Returns the cube of a single number
     * @param num
     * @return
     */
    public double cubeNumber(double num) {
        return squareNumber(num) * num;
    }

    /**
     * Checks if even using mod
     * @param num
     * @return true if even
     */
    public boolean isEven(double num) {
        return num % 2==0;
    }

    /**
     * Finds if prime efficiently
     * @param num
     * @return
     */
    public boolean isPrime(int num) {
        //Make it positive!
        if (num < 0) {
            num *= -1;
        }
        if (num > 2) {
            //Using square root is the most efficient method
            for (int i = (int)Math.sqrt(num); i >= 3; i--) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
