public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Васнецов Николай Петрович", 25000, 1);
        employees[1] = new Employee("Курочкин Василий Петрович", 20000, 2);
        employees[2] = new Employee("Иволгина Наталья Павловна", 30000, 3);
        employees[3] = new Employee("Скалкина Маргарита Львовна", 28000, 4);
        employees[4] = new Employee("Карасев Андрей Николаевич", 35000, 5);
        employees[5] = new Employee("Васильев Петр Петрович", 45000, 2);
        employees[6] = new Employee("Раевская Лилия Семеновна", 80000, 1);
        employees[7] = new Employee("Скворцов Сергей Валерьевич", 43000, 3);
        employees[8] = new Employee("Калашникова Юлия Сергеевна", 51000, 4);
        employees[9] = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }

        }
        System.out.println("Минимальная зарплата " + calculateMinSalary(employees));
        System.out.println("Максимальная зарплата " + calculateMaxSalary(employees));
        System.out.println("Сумма затрат на зарплаты " + calculateTotalSalary(employees));
        System.out.println("Среднее значение зарплат " + calculateAverage(employees));
    }

    private static int calculateMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    private static int calculateMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    private static int calculateTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary = totalSalary + employees[i].getSalary();
            }
        }
        return totalSalary;
    }

    public static double calculateAverage(Employee[] employees) {
        double average = 0;
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                counter++;

                sum = sum + employees[i].getSalary();
            }
        }
            average = sum / counter;
            return average;
        }
}



