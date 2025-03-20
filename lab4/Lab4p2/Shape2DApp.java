import java.util.ArrayList;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nMENU:");
            System.out.println("1) Add a Shape");
            System.out.println("2) Calculate Total Area");
            System.out.println("3) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choose shape: 1) Circle  2) Rectangle  3) Triangle");
                    int shapeChoice = scanner.nextInt();

                    switch (shapeChoice) {
                        case 1:
                            System.out.print("Enter radius: ");
                            shapes.add(new Circle(scanner.nextDouble()));
                            break;
                        case 2:
                            System.out.print("Enter length and width: ");
                            shapes.add(new Rectangle(scanner.nextDouble(), scanner.nextDouble()));
                            break;
                        case 3:
                            System.out.print("Enter base and height: ");
                            shapes.add(new Triangle(scanner.nextDouble(), scanner.nextDouble()));
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    double totalArea = 0;
                    for (Shape s : shapes) {
                        totalArea += s.calculateArea();
                    }
                    System.out.println("Total 2D Area: " + totalArea);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
