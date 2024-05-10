package homework3;


import java.lang.reflect.Array;

public class Main {

    public static Employee [] createArr(int lenArr){
        Employee [] arr = new Employee[lenArr];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = new Employee(STR."nameEmp\{i}", STR."midNameEmp\{i}", STR."surNameEmp\{i}",
                    STR."8-999-200-32-0\{i}", "developer", 70000+i*1000, 1990+i);
        }
        arr[lenArr-1] = new Manager("Alex", "Vasilyevich", "Zaika",
                "8-999-200-32-32", "developer", 90000, 1990);
        return arr;
    }

    public static void printEmployee(Employee [] arr){
        for (Employee e : arr){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Employee [] company = createArr(10);
        printEmployee(company);
        System.out.println("-----------------------------------------------------");
        Manager.increaser(company, 20, 5000);
        printEmployee(company);
    }
}
