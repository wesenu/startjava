package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int position) {
        return numbers[position];
    }

    public int[] getNumbers(int length) {
        return Arrays.copyOf(numbers, length);
    }

    public void addNumber(int number, int position) {
        numbers[position] = number;
    }

    public void clearNumbers(int position) {
        Arrays.fill(numbers, 0, position, 0);
    }
}