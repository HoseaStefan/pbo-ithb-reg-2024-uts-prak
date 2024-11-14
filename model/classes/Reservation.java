package model.classes;

import java.util.Date;

import model.enumeration.ClassType;
import model.enumeration.TicketStatus;

import java.util.ArrayList;

public class Reservation {
    private String reservationID;
    private Date reservationDate;
    private ArrayList<Ticket> tickets;

    public Reservation(){
        
    }

    public Reservation(String reservationID) {
        this.reservationID = reservationID;
        this.reservationDate = new Date();
        
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void reserveSeat(String ticketID, String seatNumber, ClassType classType, double price){
        Ticket ticket = new Ticket(ticketID, seatNumber, classType, TicketStatus.AWAITING_PAYMENT, price);
        this.tickets.add(ticket);
    }

    public void cancelReservation(Ticket ticket){
        ticket.setStatus(TicketStatus.CANCELED);
        System.out.println("TICKET IS CANCELLED! NO REFUND ON PAYMENT MADE"); 
    }
}
