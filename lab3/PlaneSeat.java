public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seat_id) {
        this.seatId = seat_id;
        this.assigned = false;
        this.customerId = -1; // Default: No customer assigned
    }

    public int getSeatID() {
        return seatId;
    }

    public int getCustomerID() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int cust_id) {
        if (!assigned) {
            this.customerId = cust_id;
            this.assigned = true;
            System.out.println("Seat Assigned!");
        } else {
            System.out.println("Seat already assigned to a customer.");
        }
    }

    public void unAssign() {
        if (assigned) {
            System.out.println("Seat Unassigned!");
            this.assigned = false;
            this.customerId = -1;
        } else {
            System.out.println("Seat is already empty.");
        }
    }
}
