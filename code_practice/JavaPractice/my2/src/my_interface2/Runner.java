package my_interface2;

import my_interface2.bkash.BkashPaymentInfo;
import my_interface2.bkash.BkashTransferProcessor;
import my_interface2.dbbl.DbblPaymentInfo;
import my_interface2.dbbl.DbblTransferProcessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ITransferProcessor processor;
        System.out.println("Please select your payment getway");
        System.out.println("1 = Bkash: ");
        System.out.println("2 = DBBL: ");
        String line = reader.readLine();
        switch (line){
            case "1":
                System.out.println("Bkash Selected");
                System.out.println("Please Provide sender number: ");
                String bkashSender = reader.readLine();
                System.out.println("Please Provide receiver number: ");
                String bkashReceiver = reader.readLine();
                System.out.println("Please Provide Amount");
                int bkashAmount = Integer.parseInt(reader.readLine());
                BkashPaymentInfo object_For_Bkash = new BkashPaymentInfo(); // create obj
                object_For_Bkash.setSender(bkashSender);
                object_For_Bkash.setReceiver(bkashReceiver);
                object_For_Bkash.setAmount(bkashAmount);

                processor = new BkashTransferProcessor();
                processor.process(object_For_Bkash);
                break;
            case "2":
                System.out.println("Dbbl Selected");
                System.out.println("Please Provide sender number: ");
                String dbblSender = reader.readLine();
                System.out.println("Please Provide receiver number: ");
                String dbblReceiver = reader.readLine();
                System.out.println("Please Provide Amount");
                int dbblAmount = Integer.parseInt(reader.readLine());
                DbblPaymentInfo object_For_Dbbl = new DbblPaymentInfo(); // create obj
                object_For_Dbbl.setSender(dbblSender);
                object_For_Dbbl.setReceiver(dbblReceiver);
                object_For_Dbbl.setAmount(dbblAmount);

                processor = new DbblTransferProcessor();
                processor.process(object_For_Dbbl);
                break;
        }
    }
}
