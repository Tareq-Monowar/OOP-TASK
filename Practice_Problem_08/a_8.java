package Practice_Problem_08;

class Employee {
    String name, department;
    int id;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void calculatePay() {
        System.out.println("CalculatePay has been implemented.");
    }
}

class FullTimeEmployee extends Employee {
    double fixedSalary;

    FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
}
class ContractEmployee extends Employee {
    String projectName;
    double contractAmount;

    ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }
}



public class a_8 {
    public static void main(String[] args) {
        Employee ob1 = new Employee("tuhin", 2022, "SWE");
        PartTimeEmployee obj2 = new PartTimeEmployee("Rafid", 2539, "BBA", 30.35, 5);
        ContractEmployee obj3 = new ContractEmployee("Sovon", 341232, "CSE", "Reference", 2000);

        System.out.println("obj2 payment : "+ obj2.hourlyRate*obj2.hoursWorked);
        System.out.println("obj3 payment: Project Name: " + obj3.projectName + " Contract Amount: " + obj3.contractAmount);

    }
}

