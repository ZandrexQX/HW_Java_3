package homework3;

public class Employee {

    enum Genders{MALE, FEMALE};
    private static final int CURRENT_YEAR = 2024;
    private String name;
    private String midName;
    private String surName;
    private String position;
    private String phone;
    private int salary;
    private int birth;
    private int bMonth;
    private int bDay;
    private Genders gender;

    public Employee(String name, String midName, String surName, String phone,
                    String position, int salary, int birth, Genders gender) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }


    public int compare(int dd, int mm, int yyyy) {
        int empl = bDay + (bMonth << 6) + (birth << 11);
        int income = dd + (mm << 6) + (yyyy << 11);
        return empl - income;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return STR."Employee{name=\{name}, midName=\{midName}, surName=\{surName}, " +
                STR."position=\{position}, phone=\{phone}, salary=\{salary}, age=\{getAge()}";
    }

}

