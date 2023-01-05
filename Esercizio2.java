package esercizi;

import java.util.*;

public class Esercizio2 {
    static void ristampa() {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci " + (i + 1) + " lettera: ");
            char a = t.next().charAt(0);
            System.out.println(a);
        }
    }
}
