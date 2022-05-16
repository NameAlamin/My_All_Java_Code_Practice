package my_interface2.dbbl;

import my_interface2.IPaymentInfo;
import my_interface2.ITransferProcessor;

public class DbblTransferProcessor implements ITransferProcessor {

    @Override
    public void process(IPaymentInfo paymentInfo) {
        System.out.println("Sender = "+paymentInfo.getSender()
                +" Send Amount = "+paymentInfo.getAmount()
                +" Receiver = "+paymentInfo.getReceiver()
                +" (Via Dbbl)"
        );
    }
}
