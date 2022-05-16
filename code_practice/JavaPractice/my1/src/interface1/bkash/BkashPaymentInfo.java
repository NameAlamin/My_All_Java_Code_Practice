package interface1.bkash;

import interface1.IPaymentInfo;

public class BkashPaymentInfo implements IPaymentInfo {

    private String sender;
    private String receiver;
    private Double amount;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getReceiver() {
        return receiver;
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
