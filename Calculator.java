package p3;

import java.io.PrintStream;
import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number x: ");
        int x = in.nextInt();
        System.out.print("Number y: ");
        int y = in.nextInt();
        int plus = x+y;
        int minus = x-y;
        int multiply = x*y;
        int divide = x/y;
        System.out.printf("Result: plus = %d; minus = %d; multiply = %d; divide = %d", plus, minus, multiply, divide);
        in.close();

    }

}
