package corejava.assessment3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference {

    static void main(String[] args) {

       List<Integer> list = Arrays.asList(2,4,5,3,23);

       Square s = new Square();

       list.forEach(s :: getSquare);

    }

}

class Square {

    public void getSquare(int n){
        System.out.println(n * n);
    }

}