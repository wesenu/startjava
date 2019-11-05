package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private int[] numbers = new int[10];
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int[] getNumbers(int length) {
        return Arrays.copyOf(numbers, length);
    }

    public int getNumber(int position) {
        return numbers[position];
    }

    public void addNumber(int number, int position) {
        numbers[position] = number;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, -1);
    }

    public String getName() {
        return name;
    }
}