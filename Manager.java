package homework3;

public class Manager extends Employee {

    public Manager(String name, String midName, String surName,
                   String phone, String position, int salary, int birth) {
        super(name, midName, surName, phone, position, salary, birth);
    }

    public static void increaser(Employee[] emp, int age, int increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                if (!(emp[i] instanceof Manager))
                    emp[i].increaseSalary(increment);
            }
        }
    }
}
