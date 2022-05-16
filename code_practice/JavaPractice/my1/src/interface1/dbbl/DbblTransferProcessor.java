package interface1.dbbl;

import interface1.IFundTransferProcessor;
import interface1.IPaymentInfo;

public class DbblTransferProcessor implements IFundTransferProcessor {
    @Override
    public void process(IPaymentInfo iPaymentInfo) {
        System.out.println("Sender Number = "+iPaymentInfo.getSender()+"\n"+"Receiver Number = "+iPaymentInfo.getReceiver()+"\n"
                                    +"Amount = "+iPaymentInfo.getAmount()+"\n"+" (Via bKash)");
    }
}
