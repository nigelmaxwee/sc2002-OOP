import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        scanner.close();

        if (height <= 0) {
            System.out.println("Error input!!");
            return;
        }

        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {  // Even rows start with "AA". i=0 is row 1, i=1 is row 2, etc 
                for (int j = 0; j <= i; j++) {
                    System.out.print((j % 2 == 0) ? "AA" : "BB");
                }
            } else {  // Odd rows start with "BB"
                for (int j = 0; j <= i; j++) {
                    System.out.print((j % 2 == 0) ? "BB" : "AA");
                }
            }
            System.out.println();
        }
    }
}
