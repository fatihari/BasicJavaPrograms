package salaryCalculator;

/**
 * @author Fatih ARI - 23.08.2021 A class named "Employee" is designed that
 *         represents factory workers and calculates employee salaries with its
 *         methods.
 */

public class Employee {
    private String name;
    private float salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, float salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private float tax() {
        if (this.salary >= 1000)
            return this.salary * 0.03f;
        else
            return 0.00f;
    }

    private int bonus() {
        if (this.workHours > 40)
            return (this.workHours - 40) * 30;
        else
            return 0;
    }

    private float raiseSalary() {
        if (this.hireYear < 10)
            return this.salary * 0.05f;
        else if (this.hireYear > 9 && this.hireYear < 20)
            return this.salary * 0.10f;
        else
            return this.salary * 0.15f;
    }

    @Override
    public String toString() {
        return "Name : " + getName() + "\nSalary : " + getSalary() + "\nWork Hours : " + getWorkHours()
                + "\nHire Year : " + getHireYear() + "\nTax : " + tax() + "\nBonus : " + bonus()
                + "\nSalary Increase : " + raiseSalary() + "\nSalary with Tax and Bonus  : "
                + (getSalary() - tax() + bonus()) + "\nTotal Salary  : "
                + (getSalary() - tax() + bonus() + raiseSalary());
    }

    public String getName() {
        return this.name;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public int getHireYear() {
        return this.hireYear;
    }

}
