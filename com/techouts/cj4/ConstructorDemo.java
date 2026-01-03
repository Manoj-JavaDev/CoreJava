package com.techouts.cj4;

public class ConstructorDemo {

    public static void main(String args[])
    {
        Techouts techOuts = new Techouts(200,"Hyderabad");
        System.out.println("Employees working in the techouts company : " + techOuts.getEmployees());

        System.out.println("Address of the company = " + techOuts.getAddress());

    }


}

class Techouts
{
    private String address;
    private int employees;

    /*Techouts(){
        System.out.println("Default Constructor,,, Techouts is a software Company");
    }*/



    // Parameterized constructor

    Techouts(int employees,String address)
    {
        this.employees = employees;
        this.address = address;
    }

    public int getEmployees()
    {
        return this.employees;
    }

    public String getAddress()
    {
        return this.address;
    }
}
