package corejava.assessment3;

import java.util.Optional;

public class OptionalClassDemo {

    static void main(String[] args) {

        String[] arr = new String[10];

        Optional<String> opt = Optional.ofNullable(arr[5]);// Stores null

        if(opt.isPresent()) {
            System.out.println("arr[5] = " + arr[5]);
        }
        else {
            System.out.println("String is Null ");
        }



    }

}
