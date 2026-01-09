package com.techouts.cj6.ExceptionHandling;

import java.util.Scanner;

public class PhoneNumberExceptionDemo {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone number !!");
        String str = sc.nextLine();
        phoneNumberCheck(str);

    }

    public static void phoneNumberCheck(String str){

        try{

            if(str.equals(null) || str.length() > 10 || str.length() < 10){
                throw new PhoneNumberException("Wrong pattern for Phone Number !!,Phone number must contains exactly 10 digits !!");
            }
            for(char ch : str.toCharArray()) {
                if(!Character.isDigit(ch)){
                    throw new PhoneNumberException("Wrong pattern for Phone Number !!, Phone number must contains exactly 10 digits !!");
                }
            }
            System.out.println("No Exception Occurred!!");
        } catch (PhoneNumberException e) {
            System.out.println(e);
        }

    }



}

class PhoneNumberException extends Exception{

    PhoneNumberException(String str)
    {
        super(str);
    }

}
