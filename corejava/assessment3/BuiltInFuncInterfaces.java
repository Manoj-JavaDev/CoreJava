package corejava.assessment3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFuncInterfaces {

    static void main(String[] args) {

        // It returns boolean by taking single parameter!
        Predicate<Integer> length = (n) -> n > 100;
        System.out.println(length.test(43));

        // This Interface contains a method that takes string and return string value.
        Function<String,String> function = (String::toString);
        System.out.println(function.apply("Manoj"));

        //This Consumer Interface takes one parameter and doesnt return anything.
        Consumer<String> consumer = (System.out :: println);
        consumer.accept("Hi");

    }

}
