package esercizi;

import java.util.*;

public class Esercizio1 {
    static void media() {
        Scanner t = new Scanner(System.in);
        int n[] = new int[8], n1[] = new int[8], cont = 0, j = 0;
        float somm = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print("Inserisci il " + (i + 1) + " numero: ");
            n[i] = t.nextInt();
            if (n[i] % 7 == 0) {
                somm += n[i];
                n1[j] = n[i];
                cont++;
                j++;
                System.out.println("Numero multiplo di 7!");
            }
        }
        float media = somm / cont;
        System.out.println("la media dei numeri multipli di 7 e': " + media);
        for (int i = 0; i < j; i++) {
            System.out.println("multiplo di 7:" + n1[i]);
        }
    }
}