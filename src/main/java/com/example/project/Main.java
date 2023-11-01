package com.example.project;

import java.time.Month;

public class Main {

    public static void main(String[] args) {
        System.out.println("Use this method to experiment");
        MonthForNumberConverter converter = new MonthForNumberConverter();
        System.out.println("When given 1, getMonthForNumber returns " + converter.getMonthForNumber(1));
    }

}
