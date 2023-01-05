package esercizi;

import java.util.*;

public class Esercizio4 {
    static void stampavocali() {
        Scanner t = new Scanner(System.in);
        System.out.println("digita una parola o una frase: ");
        String a = t.next();
        int n = a.length();
        char N[] = new char[n];
        for (int i = 0; i < n; i++) {
            N[i] = a.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            if (N[i] == 'A' || N[i] == 'E' || N[i] == 'I' || N[i] == 'O' || N[i] == 'U' || N[i] == 'a' || N[i] == 'e'
                    || N[i] == 'i' || N[i] == 'o' || N[i] == 'u') {
                System.out.print(N[i]);
            }
        }
        System.out.println();
    }
}
