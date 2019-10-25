package com.startjava.lesson_4.calculator;

class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;

    int calculate(String expression) {
        parseMathExpression(expression);
        switch(sign) {
            case '+': return add();
            case '-': return substract();
            case '*': return multiply();
            case '/': return divide();
            case '^': return raiseToPower();
            case '%': return divideByReminder();
            default: System.out.println("Oops! Something has gone wrong..." + "\n");
                return -1;
        }
    }

    private void parseMathExpression(String expression) {
        String[] arguments = expression.trim().split(" ");
        firstNumber = Integer.parseInt(arguments[0]);
        secondNumber = Integer.parseInt(arguments[2]);
        sign = arguments[1].charAt(0);
    }

    private int add() {
        return Math.addExact(firstNumber, secondNumber);
    }

    private int substract() {
        return Math.subtractExact(firstNumber, secondNumber);
    }

    private int multiply() {
        return Math.multiplyExact(firstNumber, secondNumber);
    }

    private int divide() {
        return Math.floorDiv(firstNumber, secondNumber);
    }

    private int raiseToPower() {
        return (int) Math.pow(firstNumber, secondNumber);
    }

    private int divideByReminder() {
        return Math.floorMod(firstNumber, secondNumber);
    }
}
