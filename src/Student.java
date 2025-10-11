import java.util.Scanner;

class Student {
    // Fields
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate grade
    String getGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 75) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        // Create student object
        Student student = new Student(name, marks);

        // Show grade
        System.out.println("Student: " + student.name);
        System.out.println("Marks: " + student.marks);
        System.out.println("Grade: " + student.getGrade());
    }
}
