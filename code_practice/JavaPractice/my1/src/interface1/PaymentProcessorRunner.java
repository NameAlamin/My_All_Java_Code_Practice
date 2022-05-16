package interface1;

import interface1.bkash.BkashPaymentInfo;
import interface1.bkash.BkashTransferProcessor;
import interface1.dbbl.DbblPaymentInfo;
import interface1.dbbl.DbblTransferProcessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaymentProcessorRunner {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" 1 = bKash");
        System.out.println(" 2 = Dbbl");
        String line = reader.readLine();

        IFundTransferProcessor processor; // create Common Reference for all

        switch (line){
            case "1":
                System.out.println("bKash Selected");

                System.out.println("Please provide sender number : ");
                String bkashSender = reader.readLine();
                System.out.println("Please provide receiver number : ");
                String bkashReceiver = reader.readLine();
                System.out.println("Please provide amount");
                Double bkashAmount = Double.parseDouble(reader.readLine());

                BkashPaymentInfo obj1 = new BkashPaymentInfo();
                obj1.setSender(bkashSender);
                obj1.setReceiver(bkashReceiver);
                obj1.setAmount(bkashAmount);

                processor = new BkashTransferProcessor(); // create instance bKash
                processor.process(obj1);
                break;

            case "2":
                System.out.println("Dbbl Selected");

                System.out.println("Please provide sender number : ");
                String dbblSender = reader.readLine();
                System.out.println("Please provide receiver number : ");
                String dbblReceiver = reader.readLine();
                System.out.println("Please provide amount");
                Double dbblAmount = Double.parseDouble(reader.readLine());

                DbblPaymentInfo obj2 = new DbblPaymentInfo();
                obj2.setSender(dbblSender);
                obj2.setReceiver(dbblReceiver);
                obj2.setAmount(dbblAmount);

                processor = new DbblTransferProcessor(); // create instance Dbbl
                processor.process(obj2);
                break;
        }




      /*  IFundTransferProcessor processor; // this is common interface reference

        BkashPaymentInfo obj1 = new BkashPaymentInfo();
        obj1.setSender("01724");
        obj1.setReceiver("01725");
        obj1.setAmount(2700.0);

        DbblPaymentInfo obj2 = new DbblPaymentInfo();
        obj2.setSender("017");
        obj2.setReceiver("019");
        obj2.setAmount(2000.0);

        processor = new BkashTransferProcessor(); // Dynamic method dispatch
        processor.process(obj1);

        processor = new DbblTransferProcessor();
        processor.process(obj2); */

    }
}