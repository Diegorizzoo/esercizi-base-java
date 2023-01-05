package esercizi;

public class Esercizio6 {
    static void stampastringhe(String a, int b) {
        if (b < 0) {
            System.out.println("ERRORE: numero negativo");
        } else {
            for (int i = 0; i < b; i++) {
                System.out.print(a + " ");
            }
        }

    }

}
