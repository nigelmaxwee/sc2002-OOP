import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            System.out.print("Enter the number of your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat ..");
                    System.out.print("Please enter SeatID: ");
                    int seatId = sc.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    int custId = sc.nextInt();
                    plane.assignSeat(seatId, custId);
                    break;
                case 6:
                    System.out.print("Enter SeatID to unassign customer from: ");
                    seatId = sc.nextInt();
                    plane.unAssignSeat(seatId);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
