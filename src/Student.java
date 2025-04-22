public class Student {
    // Attributes / Variables
    private String name;
    private int id;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int id, int age, double grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Custom Method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // Method to check if the student has passed (assuming passing grade is 50)
    public boolean hasPassed() {
        return grade >= 40;
    }

    // Method to update grade
    public void updateGrade(double newGrade) {
        this.grade = newGrade;
    }
}



