package tech.developingdeveloper.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhishek Saxena
 * @since 14/08/19 2:37 PM
 */

class Employee extends Person {

    public Employee(){

    }

    public Employee(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        if (getId() == 0)
            Utils.println(getName() + " - Not Working");
        else
            Utils.println(getName() + " - Working");
    }


    public static void main(String[] args) {
        new Employee().otherFun();
    }

    private void otherFun() {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Abhishek", 1));
        employees.add(new Employee("Vivek", 0));
        employees.add(new Employee("Rahul", 0));
        employees.add(new Employee("Xanther", 7));


        for (Employee employee : employees)
            employee.work();

        for (Employee employee : employees)
            employee.work();
    }
}

