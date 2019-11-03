package com.startjava.lesson_4.game;

class Player {
    private int[] numbers;
    private int attempts;
    private String name;

    Player(String name) {
        this.name = name;
    }

    public int getLastNumber() {
        return numbers[numbers.length - attempts - 1];
    }

    public void addNumber(int number) {
        if (attempts > 0) {
            numbers[numbers.length - attempts] = number;
        }
        attempts--;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
        numbers = new int[attempts];
    }

    public void printAttempts() {
        System.out.print(name + " has used his all attempts. The numbers are ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }

    public String getName() {
        return name;
    }
}