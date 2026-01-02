package com.techouts.cj2;

public class SwitchCaseDemo {
    static void main(String[] args) {

        // Switch Case - Multiway branching statement

        // Switch Case in version 1.0 Supports only int, byte, short & char
        int a = 3;

        switch (a) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2" + a);
                break;
            case 3:
                System.out.println("a = " + a);
                break;
            default:
                System.out.println("a is greater than 3");
        }
        // Switch statement works with enum type in java version 5.0

        enum Day {
            Sunday, Monday, Tuesday, Wednesday;
        }

        for (Day day : Day.values()) {
            switch (day) {
                case Sunday:
                    System.out.println("Sunday");
                    break;
                case Monday:
                    System.out.println("Monday");
                    break;
                case Tuesday:
                    System.out.println("Tuesday");
                    break;
                default:
                    System.out.println("Wednesday");
            }
        }

        // Switch Case from java version 7 includes Strings as values

        String str = "Hi";
        System.out.println(str instanceof String);
        switch (str) {
            case "Hi":
                System.out.println("Hi ,,, !!!");
            default:
                System.out.println("bye,,, !!! ");
        }

        // switch case 12 to 13
        // -> by default it breaks without using break statement

        // Returns value by ->
        int val = 3;
        int number = switch (val) {

            case 1 -> 10;
            case 2 -> 20;
            default -> 30;
        };

        System.out.println("number = " + number);

        // Switch case in the final 14 th version using of "yield keyword"

        int digit = switch (val) {
            case 1 -> {
                System.out.println("the value is one !!");
                yield 10;
            }
            case 2 -> {
                System.out.println("the value is two");
                yield 20;
            }
            default -> {
                System.out.println("It is default i.e!!");
                yield 30;
            }
        };
        System.out.println("Digit = " + digit);

        // Allows multiple values in single case

        int r = 4;

        switch (r) {
            case 1, 2, 3, 4, 5 -> System.out.println("Normal Days");
            default -> System.out.println("weekend Days!");
        }

        // Java 17 Switch Case with Pattern Matching


    }
}