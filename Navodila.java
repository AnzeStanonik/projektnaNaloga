package io.github.Smotko.Projektna3.io;

public final class Navodila {

    public static void navodiloZaNacinIzvedbe() {
        System.out.println("V primeru dinamicnega izvajanja prosim vnesite: 1" + "\nV primeru branja iz datoteke prosim vnesite: 2");
    }

    public static void navodilaDinamicnegaIzvajanja() {
        System.out.println("Prosimo vnesite prvih 24 bitov!\nTo lahko storite tako, da v cmd-ju uporabite ukaz ipconfig.\nNato poiscite IPv4 Address in prepisite vse do vkljucno z zadnjo piko.");
    }

    public static void navodilaBranja() {
        System.out.println("Prosimo vnesite ime datoteke, ki bi jo radi brali. Ne pozabite na koncico!");
    }

    public static void navodilaPisanja() {
        System.out.println("Prosimo vnesite ime datoteke, v katero bi radi pisali. Ne pozabite na koncico!");
    }

    public static void navodilaSpreminjanja() {
        System.out.println("Ce zelite izbrisati vrednosti obtojece datoteke prosim vnesite: ja \nv drugacnem primeru vnesite: ne");
    }

    public static void opozoriloPredcasneZaustavitve() {
        System.out.println("Prosim pocakajte, da se izpisejo vsi IP naslovi, \ndrugace se podatki ne bodo shranili v ustvarjeno datoteko.");
    }
}
