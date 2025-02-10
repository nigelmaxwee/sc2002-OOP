import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter starting value in US$: "); 
        int start = scanner.nextInt();
        System.out.print("Enter ending value in US$: ");
        int end = scanner.nextInt();
        System.out.print("Enter increment value: ");
        int increment = scanner.nextInt();
        
        scanner.close();

        if (start > end || increment <= 0) {
            System.out.println("Error input!!");
            return;
        }

        System.out.println("\nUsing FOR loop:");
        System.out.println("US$   S$");
        for (int s = start; s <= end; s += increment) {
            System.out.printf("%-5d  %.2f\n", s, s * 1.82); // Currency conversion rate
        }

        System.out.println("\nUsing WHILE loop:");
        System.out.println("US$   S$");
        int s = start;
        while (s <= end) {
            System.out.printf("%-5d  %.2f\n", s, s * 1.82);
            s += increment;
        }

        System.out.println("\nUsing DO-WHILE loop:");
        System.out.println("US$   S$");
        s = start;
        do {
            System.out.printf("%-5d  %.2f\n", s, s * 1.82);
            s += increment;
        } while (s <= end);
    }
}
