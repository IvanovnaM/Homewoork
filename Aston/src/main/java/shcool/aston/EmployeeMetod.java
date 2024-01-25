package shcool.aston;

public class EmployeeMetod {
    public static void main(String[] args) {

        Employee employee = new Employee("Chad Turner", "Engineer",
                "Chad Turner@gmail.com", "11111111111", 1000, 30);

        employee.printEmployeeInfo();

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Chad Turner", "Engineer",
                "Chad Turner@gmail.com", "11111111111", 1000, 30);
        employeesArray[1] = new Employee("Alma Thomas", "Job title 2",
                "Alma Thomas@gmail.com", "2222222222", 1100, 20);
        employeesArray[2] = new Employee("Catherine Adkins", "Job title 3",
                "Catherine Adkins@gmail.com", "3333333333", 1200, 25);
        employeesArray[3] = new Employee("Nellie Brown", "Job title 4",
                "Nellie Brown@gmail.com", "44444444", 1300, 37);
        employeesArray[4] = new Employee("Mary Lopez", "Job title 5",
                "Mary Lopez@gmail.com", "555555555", 1400, 23);


    }

}

