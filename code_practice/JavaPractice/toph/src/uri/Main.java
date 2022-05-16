package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double number,count=0,avg;
        int i,c=0;
        for(i=1;i<=6;i++){
            number = Double.parseDouble(reader.readLine());
            if(number>=0){
                c = c +1;
                count = count + number;
            }
        }
        avg = count/c;
        System.out.println(c+" valores positivos");
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(df.format(avg));

    }
}
