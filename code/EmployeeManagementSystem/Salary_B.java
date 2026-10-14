public class Salary_B {
public static void main(String[] args) {
        double basicSalary = 45000;

        double hra = basicSalary * 20 /100;
        double da = basicSalary *10 / 100;
        double bonus = basicSalary*5 / 100;

        double grossSalary = basicSalary + hra +da + bonus;

        System.out.println("//===========================SALARY DETAILS==========================//");
        System.out.println("basicSalary" + basicSalary
                            + "HRA: Rs." + hra 
                            + "DA: Rs." + da
                            + "BONUS: Rs." + bonus
        );
        System.out.println("//===================================================================//");
        System.out.println("gross salary: Rs." + grossSalary);

    }    
}