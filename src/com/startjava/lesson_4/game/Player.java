package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private int[] numbers = new int[10];
    private String name;

    public Player(String name) {
        this.name = name;
        Arrays.fill(numbers, -1);
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

    public void clearNumbers(int position) {
        Arrays.fill(numbers, 0, position, -1);
    }

    public String getName() {
        return name;
    }
}