package com.techouts.cj4;

public class StaticKeywordDemo {

    public static void main(String args[]) {
        new Steps();
        new Steps();

        System.out.println(Steps.steps);

        System.out.println(Steps.getSteps());

    }



}

class Steps {
    public static int steps;

    Steps(){
        steps++;
    }
    static {
        System.out.println("This is a static Block !!");
    }
    public static int getSteps() {
        return steps;
    }
}
