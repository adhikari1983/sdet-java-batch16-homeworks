package com.syntax.homeworks.homework6;

import java.util.Scanner;

public class H3DefineHourOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current time in 24-hour format: ");
        int hour = scanner.nextInt();

        String timeOfTheDay = "";
        if (hour >= 1 && hour <= 11) {
            timeOfTheDay = "Morning";
        } else if (hour >= 12 && hour <= 15) {
            timeOfTheDay = "Afternoon";
        } else if (hour >= 16 && hour <= 20) {
            timeOfTheDay = "Evening";
        } else if (hour >= 21 && hour <= 24) {
            timeOfTheDay = "Night";
        } else {
            timeOfTheDay = "Invalid Time";
        }
        System.out.println(timeOfTheDay);
    }
}
