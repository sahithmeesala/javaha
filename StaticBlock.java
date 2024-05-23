import java.util.Scanner;

public class StaticBlock {
    static int x;
    static int y;

    static {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        y = scanner.nextInt();
        System.out.println("Static block executed.");
        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("Inside main method.");
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
}
