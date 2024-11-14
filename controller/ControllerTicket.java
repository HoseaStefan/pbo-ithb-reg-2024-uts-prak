package controller;

import model.classes.*;
import model.enumeration.*;
import java.util.ArrayList;
import java.util.Date;

public class ControllerTicket {

    static ArrayList<Reservation> reservations;

    static ArrayList<Ticket> tickets1 = new ArrayList<>();
    static ArrayList<Ticket> tickets2;
    static ArrayList<Ticket> tickets3;

    public ControllerTicket() {

        createDummy();
        calculateTotalRevenue();

    }

    public void createDummy() {
        Train trainStandar = new Train(111, "Kereta Standar", TrainType.STANDARD);
        Train trainCepat = new Train(222, "Kereta CEPAT BOSS", TrainType.FASTTRAIN);

        Ticket tiket1 = new Ticket("TICKETID111", "SEAT1", ClassType.ECONOMY_CLASS, TicketStatus.AWAITING_PAYMENT,
                175000);
        tiket1.setTrain(trainStandar);
        Passenger passenger1 = new Passenger("PAS1", "STEFAN", 0, 19);
        tiket1.setPassenger(passenger1);
        OnlinePayment onlinePayment = new OnlinePayment("TRANS01", "XENDIT");
        onlinePayment.makePayment(tiket1.getPrice());
        tiket1.setOnlinepayment(onlinePayment);
        tiket1.printTicket();
        tickets1.add(tiket1);

        Reservation reservation1 = new Reservation("RESERVATION1");
        reservation1.setTickets(tickets1);
        reservations.add(reservation1);
        
    };

    public void calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Reservation reservation : reservations) {
            ArrayList<Ticket> tikets = reservation.getTickets();
            for (Ticket ticket : tikets) {
                if (ticket.getStatus() == TicketStatus.PAID) {
                    totalRevenue += ticket.getPrice();
                }
            }
        }

        System.out.println("TOTAL REVENUE : " + totalRevenue);
    }

}
