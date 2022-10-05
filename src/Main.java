public class Main {
 public static int sum(int[] salaries) {

  int sum = 0;
  for (int i = 0; i < salaries.length; i++) {
   sum = sum+ salaries[i];
  }


     return sum;
 }

 public static int average( int sum,int[]salaries) {
     int average = 0;
     if (salaries.length > 0) {
         double sum1 = 0;
         for (int i = 0; i < salaries.length; i++) {
             sum += salaries[i];
             average = sum / salaries.length;
         }
     }
     return average;

 }



public static void main (String[]args){
   String fullName1 = "Комаров Дмитрий Валентинович";
   int salary1 = 30000;
   int department1 = 1;


   String fullName2 = "Лукашин Сергей Валентинович";
   int salary2 = 40000;
   int department2 = 2;

   String fullName3 = "Максимов Роберт Фёдорович";
   int salary3 = 50000;
   int department3 = 3;

   String fullName4 = "Синезубов Николай Викторович";
   int salary4 = 60000;
   int department4 = 4;


   String fullName5 = "Блюрэй Ирина Николаевна";
   int salary5 = 70000;
   int department5 = 5;

   String[] fullNames = {"Комаров Дмитрий Валентинович", "Лукашин Сергей Валентинович", "Максимов Роберт Фёдорович",
           "Синезубов Николай Викторович", "Блюрэй Ирина Николаевна"};

   int[]salaries={30000,40000,50000,60000,70000};
   int[] departments = {1, 2, 3, 4, 5};


   for (int i = 0; i < fullNames.length; i++) {
    System.out.println("ФИО " + fullNames[i]  + " Номер отдела " + departments[i]+ " Зарплата "+ salaries[i]);
   }

   Employee dima = new Employee("Комаров Дмитрий Валентинович", 30000, 1);
   System.out.println("ФИО "+ dima.getFullName());
   System.out.println("Зарплата "+ dima.getSalary());
   dima.setSalary(35000);
 System.out.println("Зарплата изменена на "+ dima.getSalary());

    System.out.println(dima);
    System.out.println("номер отдела "+ dima.getDepartment());
    dima.setDepartment(2);
    System.out.println("номер отдела изменен на "+dima.getDepartment());
  }

 }

