public class Employee_I {

    String employeeId;
    String employeeName;
    String department;
    String designation;
    double basicSalary;
    int experience;

    // Constructor
    Employee_I(String employeeId, String employeeName, String department,
             String designation, double basicSalary, int experience) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    public static void main(String[] args) {

        Employee_I employee = new Employee_I(
            "EMP1025",
            "Rahul Sharma",
            "IT",
            "Software Developer",
            45000,
            2
        );

        System.out.println("Employee ID: " + employee.employeeId);
        System.out.println("Employee Name: " + employee.employeeName);
        System.out.println("Department: " + employee.department);
        System.out.println("Designation: " + employee.designation);
        System.out.println("Basic Salary: " + employee.basicSalary);
        System.out.println("Experience: " + employee.experience + " Years");
    }
}