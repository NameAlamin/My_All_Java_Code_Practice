package paymentGetway1.bkash;

import paymentGetway1.FundTransferProcessor;
import paymentGetway1.PaymentInfo;

public class BkashTransferProcessor implements FundTransferProcessor {

    @Override
    public void process(PaymentInfo paymentInfo) {
        System.out.println("Success For BKash!!! Amount "+paymentInfo.getAmount()+" Sender "+paymentInfo.getSender()+" And Receiver "+paymentInfo.getReceiver());

    }
}
