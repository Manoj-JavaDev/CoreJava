package corejava.assessment3;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupEmployees {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee("Manoj","IT"),new Employee("Ganesh","HR"),new Employee("Rakesh","IT"),new Employee("Pavan","IT"),
                new Employee("Chandu","HR"),new Employee("Venkat","IT"));

        Object Map;
        Map<String ,List<Employee>> listMap= list.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for(Map.Entry<String,List<Employee>> entry : listMap.entrySet()) {

            System.out.println("There are "+ entry.getValue().size() + " Persons in " + entry.getKey()+ " Department");

        }
    }

}

class Employee {

    Employee (String name,String department){
        this.department = department;
        this.name = name;
    }
    String name;
    String department;

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + ", department : " + this.department;
    }
}