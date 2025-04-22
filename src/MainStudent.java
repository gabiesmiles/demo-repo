public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Smile", 5867, 37, 87);
        student1.displayInfo();

        student1.updateGrade(92.0);
        System.out.println("Updated Grade: " + student1.getGrade());

        if (student1.hasPassed()) {
            System.out.println(student1.getName() + " has passed.");
        } else {
            System.out.println(student1.getName() + " has not passed.");
        }
    }
}

