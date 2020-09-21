// 38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
// a.	Only parameterized constructor. [Do not overload the constructor]
// b.	totalSalary always represents salary total of all the employees created.
// c.	empNo should be auto incremented.
// d.	display total employees and totalSalary using a method.
// Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.

class Employee {
  private static int empNo;
  private int salary;
  private static int totalSalary;

  Employee(int salary) {
    empNo++;
    this.salary = salary;
    totalSalary = totalSalary + salary;
  }

  void display(){
    System.out.println("Total Employees : "+empNo+" Total salaries : "+totalSalary);
  }
}

class EmployeeDemo{
    public static void main(String[] args) {
        Employee e1 = new Employee(2500);
        Employee e2 = new Employee(2500);
        Employee e3 = new Employee(2500);
        Employee e4 = new Employee(2500);
        e3.display();
        e4.display();
    }
}
