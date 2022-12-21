package cw1;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        try (
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
        ){
            Integer pierwszy =Integer.valueOf(br.readLine());
            Integer drugi =Integer.valueOf(br.readLine());
            Integer trzeci =Integer.valueOf(br.readLine());
            BigInteger czwarty = new BigInteger(br.readLine());
            BigInteger piaty = new BigInteger(br.readLine());
            int jeden = pierwszy;
            int dwa = drugi;
            int trzy = trzeci;
            System.out.println(jeden + dwa + trzy);
            System.out.println(czwarty.add(piaty));
        } catch (IOException e) {
            System.err.println("Nie znaloeziono pliku");
        }
    }
}
