package model.classes;

import model.enumeration.ClassType;
import model.enumeration.TicketStatus;

public class Ticket {
    private String ticketID;
    private String seatNumber;
    private ClassType classType;
    private TicketStatus status;
    private double price;
    private Passenger passenger;
    private Train train;
    private OnlinePayment onlinepayment;

    public Ticket(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.price = price;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public OnlinePayment getOnlinepayment() {
        return onlinepayment;
    }

    public void setOnlinepayment(OnlinePayment onlinepayment) {
        this.onlinepayment = onlinepayment;
    }

    public void printTicket(){
        System.out.println("===================================");
        System.out.println("TICKET : ");
        System.out.println("ID : " + this.ticketID);
        System.out.println("Seat Number : " + this.seatNumber);
        System.out.println("Class Type : " + this.classType);
        System.out.println("Price : " + this.price);
        System.out.println("------------------------------------");
        this.passenger.getPassengerInfo();
        System.out.println("------------------------------------");
        this.train.getTrainDetails();
        System.out.println("------------------------------------");
        System.out.println("TICKET STATUS : " + getTicketStatus());
        System.out.println("===================================");
    }

    public TicketStatus getTicketStatus(){
        if (onlinepayment.isSuccessPayment()) {
            return TicketStatus.PAID;
        } else {
            return TicketStatus.AWAITING_PAYMENT;
        }
    }
}
