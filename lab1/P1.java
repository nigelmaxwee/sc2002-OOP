import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char choice = scanner.next().charAt(0);
        scanner.close();

        switch (Character.toLowerCase(choice)) {
            case 'a':
                System.out.println("Action movie fan");
                break;
            case 'c':
                System.out.println("Comedy movie fan");
                break;
            case 'd':
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
