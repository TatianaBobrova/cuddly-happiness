package p3;

import java.io.PrintStream;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number x: ");
        int x = scanner.nextInt();
        System.out.print("Number y: ");
        int y = scanner.nextInt();
        System.out.print("Operation: ");
        int Operation = scanner.nextInt();
        if (Operation == 1) {
            System.out.println("+");
        } else if (Operation == 2) {
            System.out.println("-");
        } else if (Operation == 3) {
            System.out.println("*");
        } else if (Operation == 4) {
            System.out.println("/");
        }
        int Result;
        switch (Operation) {
            case 1:
                System.out.printf("Result: %d", x+y);
                break;
            case 2:
                System.out.printf("Result: %d", x-y);
                break;
            case 3:
                System.out.printf("Result: %d", x*y);
                break;
            case 4:
                System.out.printf("Result: %d",x/y);
                break;
        }
    }
}
