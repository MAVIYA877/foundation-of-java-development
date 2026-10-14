import java.util.Scanner;

public class DepartmentMenu_E {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Department: 1. IT 2. HR 3. Finance 4. Marketing 5. Operations");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Selected Department: IT");
                break;

            case 2:
                System.out.println("Selected Department: HR");
                break;

            case 3:
                System.out.println("Selected Department: Finance");
                break;

            case 4:
                System.out.println("Selected Department: Marketing");
                break;

            case 5:
                System.out.println("Selected Department: Operations");
                break;

            default:
                System.out.println("Invalid Department");
        }

        sc.close();
    }
}