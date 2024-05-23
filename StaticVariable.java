import java.util.Scanner;

class Student {
    int rollno;
    String name;
    static String college = "SAHE";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    void display() {
        System.out.println();
        System.out.println("Student roll number is " + rollno);
        System.out.println("The name of the student is " + name);
        System.out.println("College name is " + college);
        
    }

}

public class StaticVariable {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for student 1:");
        System.out.print("Enter roll number: ");
        int roll1 = scanner.nextInt();
        System.out.print("Enter name: ");
        String name1 = scanner.next();

        System.out.println("Enter details for student 2:");
        System.out.print("Enter roll number: ");
        int roll2 = scanner.nextInt();
        System.out.print("Enter name: ");
        String name2 = scanner.next();

        System.out.println("Enter details for student 3:");
        System.out.print("Enter roll number: ");
        int roll3 = scanner.nextInt();
        System.out.print("Enter name: ");
        String name3 = scanner.next();

        Student s1 = new Student(roll1, name1);
        Student s2 = new Student(roll2, name2);
        Student s3 = new Student(roll3, name3);

        System.out.println("\nStudent details:");
        s1.display();
        s2.display();
        s3.display();

        scanner.close();
    }
}
