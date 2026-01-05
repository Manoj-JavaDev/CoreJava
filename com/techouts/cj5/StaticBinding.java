package com.techouts.cj5;

public class StaticBinding {

    public static void main(String[] args) {


        // Static Binding Can be done in Compile time
        Addition a = new NewAddition();

        System.out.println(a.add(10));
        System.out.println(Addition.add(10, 20));
        System.out.println(a.add(30, 40, 50));
        // Dynamic Binding!!
        NewAddition na = new NewAddition();
        System.out.println(na.add(30,40,50));

    }

}

class Addition {

    static int add(int a ,int b)
    {
        return (a + b);
    }

    int add(int a , int b , int c ){
        return (a + b + c);
    }
    final int add(int a)
    {
        return a;
    }

}

class NewAddition extends Addition {

    int add(int a,int b,int c){
       return (a + b + c + 10) ;
    }

}
