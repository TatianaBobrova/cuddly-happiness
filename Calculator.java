package p3;
import java.io.PrintStream;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator colc = new Calculator();
        String close = "yas";
        do {
            System.out.print("Number x: ");
            int x = scanner.nextInt();
            System.out.print("Number y: ");
            int y = scanner.nextInt();
            System.out.print("Operation: ");
            char Operation = scanner.next().charAt(0);
            switch (Operation) {
                case '+':
                    System.out.printf("Result: %d \n", x + y);
                    break;
                case '-':
                    System.out.printf("Result: %d \n", x - y);
                    break;
                case '*':
                    System.out.printf("Result: %d \n", x * y);
                    break;
                case '/':
                    System.out.printf("Result: %d \n", x / y);
                    break;
                default:
                    System.out.println("Error \n");
            }
            System.out.println("Repeat: yas / no");
            close = scanner.next();
        }while (!close.equals("no"));

    }
}