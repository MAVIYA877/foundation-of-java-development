public class ExperienceClassifier_D {
    public static void main(String[] args) {

        int experience = 2;
        String category;

        if (experience <= 1) {
            category = "Fresher";
        } else if (experience <= 4) {
            category = "Junior";
        } else if (experience <= 9) {
            category = "Experienced";
        } else {
            category = "Senior";
        }

        System.out.println("Experience : " + experience + " Years Category : " + category);
    }
}