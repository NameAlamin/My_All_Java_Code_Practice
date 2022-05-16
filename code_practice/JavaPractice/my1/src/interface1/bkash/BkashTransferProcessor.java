package interface1.bkash;

import interface1.IFundTransferProcessor;
import interface1.IPaymentInfo;

public class BkashTransferProcessor implements IFundTransferProcessor {

    @Override
    public void process(IPaymentInfo iPaymentInfo) {
        System.out.println("Sender Number = "+iPaymentInfo.getSender()+"\n"+"Receiver Number = "+iPaymentInfo.getReceiver()+"\n"
                +"Amount = "+iPaymentInfo.getAmount()+"\n"+" (Via bKash)");
    }
}
