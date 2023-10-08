package Lecture5;

import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //метод do while
       /*String close = "1";
        do {
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            System.out.print("Введите знак операции (+, -, *, /): ");
            char x = in.next().charAt(0);
            switch (x) {
                case '+':
                    System.out.printf("Итог: %d \n", num1 + num2);
                    break;
                case '-':
                    System.out.printf("Итог: %d \n", num1 - num2);
                    break;
                case '*':
                    System.out.printf("Итог: %d \n", num1 * num2);
                    break;
                case '/':
                    System.out.printf("Итог: %d \n", num1 / num2);
                    break;
                default:
                    System.out.println("Ошибка \n");
            }
            System.out.print("Повторить операцию (1-да / 2-нет): ");
            close = in.next();
        }while (!close.equals("2"));*/

        //метод while (true)
        String c = "1";
        while (true){
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите знак операции (+, -, *, /, либо # для Выхода): ");
        char x = in.next().charAt(0);
        System.out.print("Повторить операцию (1-да / 2-нет");
        int s = in.nextInt();
        switch (x){
            case '+':
                System.out.printf("Итог: %d \n", num1 + num2);
                break;
            case '-':
                System.out.printf("Итог: %d \n", num1 - num2);
                break;
            case '*':
                System.out.printf("Итог: %d \n", num1 * num2);
                break;
            case '/':
                System.out.printf("Итог: %d \n", num1 / num2);
                break;
            case '#':
                System.exit(0);
            default:
                System.out.println("Ошибка \n");
            }
            c = in.next();
        } if (c.equals("2")) break ;
    }
}
