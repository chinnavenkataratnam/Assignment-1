import java.util.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class QuestionNumber5 {
    public static void main(String[] args) {
        try {
            int total = 0;
            String s = "";
            Double totalbill = 0.00, max = 0.00, min = 99999.00;
            BufferedReader b = new BufferedReader(new FileReader("q5.csv"));
            while ((s = b.readLine()) != null) {
                String totalamount[] = s.split(",");
                int n = totalamount.length;
                total++;
                Double k = Double.parseDouble(totalamount[n - 1]);
                totalbill += k;
                if (k > max) {
                    max = k;
                }
                if (k < min) {
                    min = k;
                }
            }
            System.out.println("Total number of Transactions (bills) :" + total);
            System.out.println("Total Bill amount :" + totalbill);
            System.out.println("Maximum Bill amount :" + max);
            System.out.println("Minimum Bill amount :" + min);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Running Error");
        }

    }
}