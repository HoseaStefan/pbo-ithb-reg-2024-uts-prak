package model.classes;

import model.interfaces.Payment;

public class OnlinePayment implements Payment{
    private String transactionID;
    private String paymentGateway;
    private boolean successPayment;

    public OnlinePayment(String transactionID, String paymentGateway) {
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
        this.successPayment = false;
    }

    public boolean isSuccessPayment() {
        return successPayment;
    }

    public void setSuccessPayment(boolean successPayment) {
        this.successPayment = successPayment;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void makePayment(double amount){
        System.out.println("Payment: "+ getTransactionID() + " Successfull from " + getPaymentGateway());
        System.out.println("Payment Amount : " + amount);
        this.successPayment = true;
    }
}
