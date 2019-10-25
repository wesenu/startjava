package com.startjava.lesson_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        String mathExpression, choice;
        int result;

        do {
            System.out.print("\n" + "Type the expression [x + x][+-*/^%]: ");
            mathExpression = scanner.nextLine();
            result = calculator.calculate(mathExpression);
            System.out.println("Result: " + result);
            do {
                System.out.print("Do you want to continue? [yes / no] - ");
                choice = scanner.nextLine();
            } while (!"no".equals(choice) && !"yes".equals(choice));
        } while (!"no".equals(choice));
    }
}