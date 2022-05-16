package paymentGetway1.dbbl;

import paymentGetway1.FundTransferProcessor;
import paymentGetway1.PaymentInfo;

public class DbblTransferProcessor implements FundTransferProcessor {
    @Override
    public void process(PaymentInfo paymentInfo) {
        System.out.println("Success For DBBL!!! Amount "+paymentInfo.getAmount()+" Sender "+paymentInfo.getSender()+" And Receiver "+paymentInfo.getReceiver());
    }
}
