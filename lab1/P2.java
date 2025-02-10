import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: $");
        int salary = scanner.nextInt();
        System.out.print("Enter merit points: ");
        int merit = scanner.nextInt();

        scanner.close();

        String grade;
        if (salary >= 700 && salary <= 799) {
            grade = (merit >= 20) ? "A" : "B";
        } else if (salary >= 600 && salary <= 649) {
            grade = (merit >= 10) ? "B" : "C";
        } else if (salary >= 500 && salary <= 649) {
            grade = "C";
        } else if (salary >= 800) {
            grade = "A";
        } else {
            grade = "Invalid salary range";
        }

        System.out.println("Grade: " + grade);
    }
}
