//====================if conditional====================//
/* 
public class control_statement {
    public static void main(String[] args) {
        
        int age = 18;

        if(age >= 18){
            System.out.println("eligibal to vote!");
        }
    }
}
*/


//====================if-else-conditional====================//
/* 
public class control_statement {

    public static void main(String[] args) {
        
        int marks = 80;

        if(marks >=40){
            System.err.println("pass");
        }
        else{
            System.err.println("fail........!");
        }
    }
}
*/


//====================else-if conditional====================//
/* 
public class control_statement {

    public static void main(String[] args) {
        
        int marks = 90;

        if(marks >= 90){
            System.err.println("A+");
        }
        else if (marks >= 80){
            System.out.println("A+");
        }
        else if (marks >= 70){
            System.out.println("B");
        }
        else if (marks >= 60){
            System.out.println("C");
        }
        else if (marks >= 50){
            System.out.println("D");
        }
        else{
            System.out.println("failed...........!");
        }
    }
}
*/


//====================nested-if====================//
/* 
public class control_statement {

    public static void main(String[] args) {
        
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("Can drive");
    }

}
    }
}
*/