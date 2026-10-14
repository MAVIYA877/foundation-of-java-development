import java.util.Scanner;

public class VerifyId_F {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String registeredId = "EMP1025";
        String enteredId;

        while (true) {
            System.out.print("Enter Employee ID for verification: ");
            enteredId = sc.nextLine();

            if (enteredId.equals(registeredId)) {
                System.out.println("Employee verified successfully.");
                break;
            } else {
                System.out.println("Invalid Employee ID. Please try again.");
            }
        }

        sc.close();
    }
}