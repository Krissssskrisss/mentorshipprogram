public abstract class Employee {

    private String firstName;
    private String lastName;
    private int id;

    Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public abstract double getAverageSalary();

    public String employeeToString() {
        return "Employee[" + firstName + " " + lastName + " Average Salary:" + getAverageSalary() + "]";
    }

}
