package Lab.exp15;

import javax.lang.model.util.ElementScanner6;
import java.io.*;
import java.util.Scanner;


public class FileHandling {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        File file = new File(input);
        BufferedReader br = new BufferedReader(new FileReader(file));


        String orig = "";

        String st;
        while ((st = br.readLine()) != null)

        {

            orig = orig + st;
        }

        System.out.println("\n\n orignal Paragraph \n\n"+orig);
        String enc = Encrypt(orig);

        FileWriter myWriter = new FileWriter(input);
        myWriter.write(enc);
        myWriter.close();

        System.out.println("\n\n Encrypted Paragraph \n\n"+enc);
        String dec = Decrypt(enc);
        System.out.println("\n\n orignal Paragraph \n\n"+dec);

    }


    public static String Encrypt(String str) {
        String ans = "";
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (sb.length() > 0) {

            char ch = sb.charAt(0);

            int ch1 = (ch + 2) * 2;

            ans = ans + (char) ch1;
            sb.deleteCharAt(0);
        }
        return ans;
    }


    public static String Decrypt(String str) {

        String ans = "";
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (sb.length() > 0) {

            char ch = sb.charAt(0);

            int ch1 = (ch / 2) - 2;

            ans = ans + (char) ch1;
            sb.deleteCharAt(0);
        }
        return ans;
    }

}
