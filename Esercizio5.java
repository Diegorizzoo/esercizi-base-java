package esercizi;

import java.util.*;

public class Esercizio5 {
    static void stampalunghezza() {
        Scanner t = new Scanner(System.in);
        boolean a = true;
        final int max = 50;
        String b[] = new String[max];
        int i = 0, cont = 0;
        int somm = 0;
        while (a == true) {
            cont++;
            System.out.print("Inserisci stringa: ");
            b[i] = t.next();
            System.out.println("Vuoi inserire un altra stringa? digita si per continuare ");
            String s = t.next();
            if (s.compareTo("si") == 0 || s.compareTo("Si") == 0) {
                i++;
            } else {
                a = false;
                b[i + 1] = " ";
                cont++;
            }

        }
        for (i = 0; i < cont; i++) {
            if (Character.isUpperCase(b[i].charAt(0))) {
                somm += b[i].length();
            }

        }
        System.out.println("La lunghezza delle stringhe che iniziano con una lettera maiuscola è: " + somm);

    }
}
