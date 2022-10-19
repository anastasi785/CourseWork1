public class Employee {
    private String fullName;
    private int salary;
    private int department;

    private final int id;
    private static int numberCreation=0;



    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id=++numberCreation;
    }
    public int getNumberCreation(){
        return numberCreation;
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
    public int getId(){
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        if(department<1||department>5){
            System.out.println("Значение отдела не может быть меньше 1 и больше 5");
            return;
        }

        this.department = department;
    }

    @Override
    public String toString() {
        return  " Employee "+ " ФИО "+ fullName  +
                 " Зарплата " +salary +
                " Отдел "+ department+
               " id " +id;
    }


}
