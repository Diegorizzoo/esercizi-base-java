package esercizi;

import java.util.Random;

public class Esercizio7 {
    static void pariEdispari() {
        int array[]=new int [10];
        Random r=new Random();
        float somm1=0,somm2=0;
        for(int i=0;i<10;i++){
            array[i]=r.nextInt(10);
            if(i%2==0){
                somm1+=array[i];
            }
            else{
                somm2+=array[i];
            }
        }
        if(somm1==somm2){
            System.out.println("Pari e dispari uguali ");
        }
        else{
            System.out.println("Pari e dispari diversi ");
        }

    }

}
