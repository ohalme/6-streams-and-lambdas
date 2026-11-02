package esim;

import java.util.Arrays;

public class Streamitesimerkki {

    public static void main(String[] args) {

        int[] luvut = { 1, 2, 4, 56, 6, 3, 2, 2, 4, 5, 3, 2, 23, 66, 35, 23, 200, 100 };

        // TERMINAALIOPERAATTORI SUM LASKEE KAIKKI ALKIOT YHTEEN
        // TERMINAALIOPERAATTORI TARKOITTAA SITÄ, ETTÄ SE VOI OLLA VAIN KOMENTOKETJUN
        // VIIMEISENÄ

        int summa = Arrays.stream(luvut).sum();
        System.out.println("Summa: " + summa);
    }

}
