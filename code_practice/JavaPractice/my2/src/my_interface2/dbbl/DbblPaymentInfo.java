package my_interface2.dbbl;

import my_interface2.IPaymentInfo;

public class DbblPaymentInfo implements IPaymentInfo {
    private String sender;
    private String receiver;
    private int amount;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAmount(int amount) {
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
    public int getAmount() {
        return amount;
    }
}
