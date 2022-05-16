package my_interface2.bkash;

import my_interface2.IPaymentInfo;
import my_interface2.ITransferProcessor;

public class BkashTransferProcessor implements ITransferProcessor {
    @Override
    public void process(IPaymentInfo paymentInfo) {
        System.out.println("Sender = "+paymentInfo.getSender()
                +" Send Amount = "+paymentInfo.getAmount()
                +" Receiver  = "+paymentInfo.getReceiver()
                +" (Via bKash)"
        );
    }
}
