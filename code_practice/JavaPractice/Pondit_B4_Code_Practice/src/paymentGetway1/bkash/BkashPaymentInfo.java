package paymentGetway1.bkash;

import paymentGetway1.PaymentInfo;

public class BkashPaymentInfo implements PaymentInfo {

    private String sender;
    private  String receiver;
    private double amount;

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getReceiver() {
        return receiver;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
