import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane() {
        this.seat = new PlaneSeat[12];
        this.numEmptySeat = 12;
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats.");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (PlaneSeat s : seat) {
            if (!s.isOccupied()) {
                System.out.println("SeatID " + s.getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        PlaneSeat[] assignedSeats = Arrays.stream(seat)
            .filter(PlaneSeat::isOccupied)
            .toArray(PlaneSeat[]::new);

        if (!bySeatId) {
            Arrays.sort(assignedSeats, Comparator.comparingInt(PlaneSeat::getCustomerID));
        }

        System.out.println("The seat assignments are as follow:");
        for (PlaneSeat s : assignedSeats) {
            System.out.println("SeatID " + s.getSeatID() + " assigned to CustomerID " + s.getCustomerID() + ".");
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        if (seatId < 1 || seatId > 12) {
            System.out.println("Invalid Seat Number!");
            return;
        }
        if (!seat[seatId - 1].isOccupied()) {
            System.out.println("Assigning Seat ..");
            System.out.print("Please enter SeatID: " + seatId + "\n");
            System.out.print("Please enter Customer ID: " + cust_id + "\n");
            seat[seatId - 1].assign(cust_id);
            numEmptySeat--;
        } else {
            System.out.println("Seat already assigned to a customer.");
        }
    }

    public void unAssignSeat(int seatId) {
        if (seatId < 1 || seatId > 12) {
            System.out.println("Invalid Seat Number!");
            return;
        }
        if (seat[seatId - 1].isOccupied()) {
            System.out.println("Enter SeatID to unassign customer from: " + seatId);
            seat[seatId - 1].unAssign();
            numEmptySeat++;
        } else {
            System.out.println("Seat is already empty.");
        }
    }
}
