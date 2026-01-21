package com.techouts.cj8;

public class LamdaExpressionBlockDemo {

    public static void main(String[] args) {

        Fact fact = (n) -> {
            int ans = 1;
            for(int i = 2;i <= n;i++) {
                ans *= i;
            }
            return ans;
        };

        System.out.println("Factorial of Number = " + fact.factorial(4));

    }

}

interface Fact {
    int factorial(int a);
}