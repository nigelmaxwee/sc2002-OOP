import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp2 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> shapes = new ArrayList<>(); 
        int choice;  // ✅ Declare choice before using it

        do {
            System.out.println("\nMENU:");
            System.out.println("1) Add a Shape");
            System.out.println("2) Calculate Total Surface Area");
            System.out.println("3) Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();  // ✅ Now this works because choice is declared

            switch (choice) {
                case 1:
                    System.out.println("Choose shape: 1) Sphere  2) Cylinder  3) Cone");
                    int shapeChoice = scanner.nextInt();

                    switch (shapeChoice) {
                        case 1:
                            System.out.print("Enter radius: ");
                            shapes.add(new Sphere(scanner.nextDouble()));
                            break;
                        case 2:
                            System.out.print("Enter radius and height: ");
                            shapes.add(new Cylinder(scanner.nextDouble(), scanner.nextDouble()));
                            break;
                        case 3:
                            System.out.print("Enter radius and slant height: ");
                            shapes.add(new Cone(scanner.nextDouble(), scanner.nextDouble()));
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    double totalSurfaceArea = 0;
                    for (Object s : shapes) {
                        if (s instanceof Sphere) {
                            totalSurfaceArea += ((Sphere) s).calculateSurfaceArea();
                        } else if (s instanceof Cylinder) {
                            totalSurfaceArea += ((Cylinder) s).calculateSurfaceArea();
                        } else if (s instanceof Cone) {
                            totalSurfaceArea += ((Cone) s).calculateSurfaceArea();
                        }
                    }
                    System.out.println("Total 3D Surface Area: " + totalSurfaceArea);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);  // ✅ Now this works because choice is declared

        scanner.close();
    }
}
