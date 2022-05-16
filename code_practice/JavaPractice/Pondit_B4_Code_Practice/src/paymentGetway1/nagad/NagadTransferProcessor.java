package paymentGetway1.nagad;

import paymentGetway1.FundTransferProcessor;
import paymentGetway1.PaymentInfo;

public class NagadTransferProcessor implements FundTransferProcessor {
    @Override
    public void process(PaymentInfo paymentInfo) {
        System.out.println("Success For Nagad!!! Amount "+paymentInfo.getAmount()+" Sender "+paymentInfo.getSender()+" And Receiver "+paymentInfo.getReceiver());
    }
}
