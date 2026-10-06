import java.util.Scanner;
public class MainMenu_G {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n================ EMPLOYEE MANAGEMENT ================");
            System.out.println("1. View Employee Details");
            System.out.println("2. View Salary Details");
            System.out.println("3. View Performance");
            System.out.println("4. View Employee Rating");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Employee Details");
                    break;

                case 2:
                    System.out.println("Salary Details");
                    break;

                case 3:
                    System.out.println("Performance Details");
                    break;

                case 4:
                    System.out.println("Employee Rating");
                    break;

                case 5:
                    System.out.println("Exiting Employee Management...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}