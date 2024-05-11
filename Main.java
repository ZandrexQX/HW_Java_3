package homework3;

public class Main {
    enum Parties {NONE, NEW_YEAR, MARCH_8, FEB_23}

    private static final Parties today = Parties.FEB_23;

    private static void celebrate(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            switch (today) {
                case NEW_YEAR:
                    System.out.println(emp[i].getName() + ", happy New Year!");
                    break;
                case FEB_23:
                    if (emp[i].getGender() == Employee.Genders.MALE)
                        System.out.println(emp[i].getName() + ", happy February 23rd!");
                    break;
                case MARCH_8:
                    if (emp[i].getGender() == Employee.Genders.FEMALE)
                        System.out.println(emp[i].getName() + ", happy march 8th!");
                    break;
                default:
                    System.out.println(emp[i].getName() + ", celebrate this morning!");
            }
        }
    }


    public static Employee[] createArr(int lenArr) {
        Employee[] arr = new Employee[lenArr];
        for (int i = 0; i < arr.length - 1; i++) {
            Employee.Genders gender = null;
            if (i % 2 == 0) {
                gender = Employee.Genders.MALE;
            } else {
                gender = Employee.Genders.FEMALE;
            }
            arr[i] = new Employee(STR."nameEmp\{i}", STR."midNameEmp\{i}", STR."surNameEmp\{i}",
                    STR."8-999-200-32-0\{i}", "developer", 70000 + i * 1000, 1990 + i, gender);
        }
        arr[lenArr - 1] = new Manager("Alex", "Vasilyevich", "Zaika",
                "8-999-200-32-32", "developer", 90000, 1990, Employee.Genders.MALE);
        return arr;
    }

    public static void printEmployee(Employee[] arr) {
        for (Employee e : arr) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Employee[] company = createArr(10);
        printEmployee(company);
        System.out.println("-----------------------------------------------------");
        Manager.increaser(company, 20, 5000);
        printEmployee(company);
        System.out.println("-----------------------------------------------------");
        celebrate(company);
    }
}
