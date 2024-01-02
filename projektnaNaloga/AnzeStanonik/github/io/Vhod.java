package projektnaNaloga.AnzeStanonik.github.io;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.net.*;
import projektnaNaloga.AnzeStanonik.github.io.nacinIzvedbe.*;

public class Vhod extends Thread{ 
    public static void main(String[] args) throws UnknownHostException, IOException{ 

        Scanner sc = new Scanner(System.in);
        Navodila.navodiloZaNacinIzvedbe();
        int nacinIzvedbe = 0; 
        nacinIzvedbe = sc.nextInt();
        ArrayList<String> IPnaslovi = new ArrayList<>(256);

        if(nacinIzvedbe == 1) { 
            Navodila.navodilaDinamicnegaIzvajanja();
            String prvaTretjinaBitov = sc.next();
            prvaTretjinaBitov = "192.168.8.";

            Navodila.navodilaPisanja();
            String imeDatoteke = sc.next();
            Path pot = FileSystems.getDefault().getPath("projektnaNaloga/AnzeStanonik/github/io/omrezja", imeDatoteke);
            PrintWriter pw = new PrintWriter(pot.toString(), StandardCharsets.UTF_8.toString());

            Navodila.opozoriloPredcasneZaustavitve();
            for (int i = 0; i <= 255; i++) {
            String ip = prvaTretjinaBitov + i;
            DinamicnoIzvajanje.posljiProsnjoPing(ip);

            IPnaslovi.add(i, ip);
            String csv = "\",\"";
            pw.println("\"" + IPnaslovi.get(i) + csv + DinamicnoIzvajanje.getDosegljivost() + csv);
            }
            pw.close();
             

        }else if (nacinIzvedbe == 2) {
            Navodila.navodilaBranja();
            String imeDatoteke = sc.next();
            try {
                Path pot = FileSystems.getDefault().getPath("projektnaNaloga/AnzeStanonik/github/io/omrezja", imeDatoteke);
                BufferedReader br = Files.newBufferedReader(pot, StandardCharsets.UTF_8);
    
                if (br.ready()) {
                    String vrstica = null;
                    int i = 0;
                    while ((vrstica = br.readLine()) != null) {
                        IPnaslovi.add(i, vrstica);
                        System.out.println(IPnaslovi.get(i));
                        i++;
                    }
                }

                br.close();

            }catch (NoSuchFileException f){
                Izjeme.datotekeNiMoznoNajti();
            }

        }else {
            System.out.println("Prosim vnesite pravilne podatke!");
        }
        sc.close();
    }
}

