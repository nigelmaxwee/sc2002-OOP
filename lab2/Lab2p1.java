import java.util.Scanner;

public class Lab2p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPerform the following methods:");
            System.out.println("1: Multiplication test");
            System.out.println("2: Quotient using division by subtraction");
            System.out.println("3: Remainder using division by subtraction");
            System.out.println("4: Count the number of digits");
            System.out.println("5: Position of a digit");
            System.out.println("6: Extract all odd digits");
            System.out.println("7: Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: mulTest(); break;
                case 2: 
                    System.out.print("Enter m: ");
                    int m = sc.nextInt();
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.println("Quotient: " + divide(m, n));
                    break;
                case 3: 
                    System.out.print("Enter m: ");
                    m = sc.nextInt();
                    System.out.print("Enter n: ");
                    n = sc.nextInt();
                    System.out.println("Remainder: " + modulus(m, n));
                    break;
                case 4: 
                    System.out.print("Enter a positive integer: ");
                    int num = sc.nextInt();
                    System.out.println("Number of digits: " + countDigits(num));
                    break;
                case 5: 
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();
                    System.out.print("Enter digit to search: ");
                    int digit = sc.nextInt();
                    System.out.println("Position: " + position(num, digit));
                    break;
                case 6: 
                    System.out.print("Enter a number: ");
                    long longNum = sc.nextLong();
                    System.out.println("Extracted odd digits: " + extractOddDigits(longNum));
                    break;
                case 7: System.out.println("Program terminating..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);

        sc.close();
    }

    // 1. Multiplication Test
    public static void mulTest() {
        Scanner sc = new Scanner(System.in);
        int correct = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = (int) (Math.random() * 9) + 1;
            int num2 = (int) (Math.random() * 9) + 1;
            System.out.print("How much is " + num1 + " times " + num2 + "? ");
            int answer = sc.nextInt();
            
            if (answer == num1 * num2) {
                correct++;
            }
        }

        System.out.println(correct + " answers out of 5 are correct.");
    }

    // 2. Division by Subtraction (Quotient)
    public static int divide(int m, int n) {
        int count = 0;
        while (m >= n) {
            m -= n;
            count++;
        }
        return count;
    }

    // 3. Modulus by Subtraction (Remainder)
    public static int modulus(int m, int n) {
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    // 4. Count the Number of Digits
    public static int countDigits(int n) {
        if (n < 0) {
            System.out.println("Error input!!");
            return -1;
        }
        return String.valueOf(n).length();
    }

    // 5. Find Position of a Digit (from right)
    public static int position(int n, int digit) {
        int pos = 1;
        while (n > 0) {
            if (n % 10 == digit) {
                return pos;
            }
            n /= 10;
            pos++;
        }
        return -1;
    }

    // 6. Extract Odd Digits from a Number
    public static long extractOddDigits(long n) {
        if (n < 0) {
            System.out.println("Error input!!");
            return -1;
        }

        long result = 0;
        long placeValue = 1;

        while (n > 0) {
            int digit = (int) (n % 10);
            if (digit % 2 == 1) { // Check if the digit is odd
                result = (digit * placeValue) + result;
                placeValue *= 10;
            }
            n /= 10;
        }

        return (result == 0) ? -1 : result;
    }
}
