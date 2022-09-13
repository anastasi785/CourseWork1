public class Employee {
    private String fullName;
    private int salary;
    private int department;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee " +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", department=" + department;
    }


}
