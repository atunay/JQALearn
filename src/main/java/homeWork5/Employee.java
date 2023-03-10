package homeWork5;

public class Employee extends Person {
    double daySalary;



    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;

    }

    public void calculateOvertime(double addHours) {

        double extraMoney;

        if (age >= 18) {
            extraMoney = addHours * (daySalary/8) * 1.5;
        } else {
            extraMoney = 0;
        }

        System.out.println("Extra money for additional hours are: " + extraMoney);

    }

    public void showEmployeeInfo() {
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The person is male: " + isMan);
        System.out.println("The day salary is: " + daySalary);

    }

}
