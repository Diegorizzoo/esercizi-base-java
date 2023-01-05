package esercizi;

import java.util.*;

public class Esercizio3 {
    static void reverseprint() {
        Scanner t = new Scanner(System.in);
        System.out.println("digita una parola o una frase: ");
        String a = t.next();
        int n = a.length();
        char N[] = new char[n];
        for (int i = 0; i < n; i++) {
            N[i] = a.charAt(i);
        }
        for (int i = n - 1; i > -1; i--) {
            System.out.print(N[i]);
        }
        System.out.println();
    }
}
