package corejava.assesment1;

public class ConstructorDemo {

    public static void main(String args[]) {
        Company c1 = new Company(); // Default constructor;
        System.out.println("Company Name = " + c1.getCompanyName());
        System.out.println("Company Address = " + c1.getCompanyAddress());
        Company c2 = new Company("Techouts","Gachibowli, Hyderabad");

        System.out.println("Company Name = " + c2.getCompanyName());
        System.out.println("Company Address = " + c2.getCompanyAddress());


    }

}

class Company {
    private String companyName;
    private String companyAddress;

    Company() {
        System.out.println("Default Constructor for company class");
    }

    Company(String companyName,String companyAddress) {
        System.out.println("This is parameterised constructor!!");
        this.companyAddress = companyAddress;
        this.companyName = companyName;
    }

    String getCompanyName()
    {
        return this.companyName;
    }
    String getCompanyAddress() {
        return this.companyAddress;
    }
}


