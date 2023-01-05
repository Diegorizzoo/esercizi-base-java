package esercizi;

import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        String o;
        do {
            System.out.println("Inserisci numero dell'esercizio da eseguire: ");
            int s = t.nextInt();
            switch (s) {
                case 1:
                    Esercizio1.media();
                    break;
                case 2:
                    Esercizio2.ristampa();
                    break;
                case 3:
                    Esercizio3.reverseprint();
                    break;
                case 4:
                    Esercizio4.stampavocali();
                    break;
                case 5:
                    Esercizio5.stampalunghezza();
                    break;
                case 6:
                    System.out.print("Inserisci stringa: ");
                    String stringa = t.next();
                    System.out.println("inserisci un numero intero positivo: ");
                    int numero = t.nextInt();
                    Esercizio6.stampastringhe(stringa, numero);
                    break;
                case 7:
                    Esercizio7.pariEdispari();
                    break;
                default:
                    System.out.println("Esercizio non esistente! ");
                    break;
            }
            System.out.println("Digita si per ricominciare: ");
            o = t.next();
        } while (o.compareTo("si") == 0 || o.compareTo("Si") == 0);
    }
}
