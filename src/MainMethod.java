public class MainMethod {
    public static void main(String[] args) {
        // Creating a Student object using the constructor
        Student student1 = new Student("Gabriella", 101, 25, 25);

        // Displaying student info
        student1.displayInfo();

        // Checking if the student has passed
        if (student1.hasPassed()) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        // Updating grade

        System.out.println("\nAfter grade update:");
        student1.displayInfo();
        System.out.println("Status: " + (student1.hasPassed() ? "Passed" : "Failed"));
    }
}
