package src.arpit.normal;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number:");
        int num1 =sc.nextInt();
        System.out.println("Enter second number:");
        int num2 =sc.nextInt();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        int result;

        if(operator== '+'){
            result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("The quotient is: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator!");
        }

    }
    
}
