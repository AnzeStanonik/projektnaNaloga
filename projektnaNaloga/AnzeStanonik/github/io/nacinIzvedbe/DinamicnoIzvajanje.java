package projektnaNaloga.AnzeStanonik.github.io.nacinIzvedbe;

import java.io.*;
import java.net.*;

public class DinamicnoIzvajanje {
    static boolean dosegljivost = true;

    public static void posljiProsnjoPing(String ipNaslov) throws UnknownHostException, IOException {
        InetAddress naslov = InetAddress.getByName(ipNaslov);
        System.out.print("Posiljanje prosnje Ping " + ipNaslov);

        if (naslov.isReachable(500)) {
            System.out.println(" Gostitelj je dosegljiv.");
            dosegljivost = true;
        }else {
            System.out.println(" Oprostite, tega gostitelja ne moram doseci!");
            dosegljivost = false;
        }
    }

    public static String getDosegljivost() {
        if (dosegljivost == true) {
            return "dosegljiv";
        }else  {
            return "\\";
        }
    }


}
