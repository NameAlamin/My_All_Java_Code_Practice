package paymentGetway1;

import paymentGetway1.bkash.BkashPaymentInfo;
import paymentGetway1.bkash.BkashTransferProcessor;
import paymentGetway1.dbbl.DbblPaymentInfo;
import paymentGetway1.dbbl.DbblTransferProcessor;
import paymentGetway1.nagad.NagadPaymentInfo;
import paymentGetway1.nagad.NagadTransferProcessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaymentProcessorRunner {
    public static void main(String[] args) throws IOException {
        /*
        BkashPaymentInfo binfo = new BkashPaymentInfo();
        binfo.setSender("Alamin");
        binfo.setReceiver("Khokon");
        binfo.setAmount(1200);
        FundTransferProcessor obj1 = new BkashTransferProcessor();
        obj1.process(binfo);

        DbblPaymentInfo dinfo = new DbblPaymentInfo();
        dinfo.setSender("Alamin Dbbl");
        dinfo.setReceiver("Khokon Dbbl");
        dinfo.setAmount(1500);
        FundTransferProcessor obj2 = new DbblTransferProcessor();
        obj2.process(dinfo);
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Select your payment gateway");
        System.out.println("1 = BKash");
        System.out.println("2 = DBBL");
        System.out.println("3 = Nagad");

        FundTransferProcessor processor;
        String line = reader.readLine();
        switch (line){
            case "1":
                System.out.println("BKash Selected");
                processor = new BkashTransferProcessor();
                System.out.println("Please provide sender number");
                String bkashSender = reader.readLine();
                System.out.println("Please provide your receiver number");
                String bkashReceiver = reader.readLine();
                System.out.println("Please enter your amount");
                Double bkashAmount = Double.parseDouble(reader.readLine());
                BkashPaymentInfo objForBkash = new BkashPaymentInfo();
                objForBkash.setSender(bkashSender);
                objForBkash.setReceiver(bkashReceiver);
                objForBkash.setAmount(bkashAmount);
                processor.process(objForBkash);

            case "2":
                System.out.println("DBBL Selected");
                processor = new DbblTransferProcessor();
                System.out.println("Please provide sender number");
                String dbblSender = reader.readLine();
                System.out.println("Please provide your receiver number");
                String dbblReceiver = reader.readLine();
                System.out.println("Please enter your amount");
                double dbblhAmount = Double.parseDouble(reader.readLine());
                BkashPaymentInfo objForDbbl = new BkashPaymentInfo();
                objForDbbl.setSender(dbblSender);
                objForDbbl.setReceiver(dbblReceiver);
                objForDbbl.setAmount(dbblhAmount);
                processor.process(objForDbbl);

            case "3":
                System.out.println("Nagad Selected");
                processor = new NagadTransferProcessor();
                System.out.println("Please provide sender number");
                String nagadSender = reader.readLine();
                System.out.println("Please provide your receiver number");
                String nagadReceiver = reader.readLine();
                System.out.println("Please enter your amount");
                double nagadAmount = Double.parseDouble(reader.readLine());
                NagadPaymentInfo objForNagad = new NagadPaymentInfo();
                objForNagad.setSender(nagadSender);
                objForNagad.setReceiver(nagadReceiver);
                objForNagad.setAmount(nagadAmount);
                processor.process(objForNagad);
        }

    }
}
