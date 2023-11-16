import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        char operator = input.next().charAt(0);

        System.out.println("Enter first number");
        double number1 = input.nextDouble();

        System.out.println("Enter second number");
        double number2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid operator!");
                input.close();
                return;
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
        input.close();
    }
}