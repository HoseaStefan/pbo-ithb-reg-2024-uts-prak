package model.classes;

public class GroupReservation extends Reservation {
    private String groupName;
    private int numberOfPassengers;

    public GroupReservation(String reservationID, String groupName, int numberOfPassengers) {
        super(reservationID);
        this.groupName = groupName;
        this.numberOfPassengers = numberOfPassengers;
    }

    public GroupReservation(String groupName, int numberOfPassengers) {
        this.groupName = groupName;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
