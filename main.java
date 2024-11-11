import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // create variables
        int fiyat2;
        double yuksekFaiz, dusukFaiz, kdvTutar;

        // Define the Scanner Class
        Scanner inp2 = new Scanner(System.in);

        // Get the Informations from users
        System.out.print("Ürünün fiyatını giriniz: ");
        fiyat2 = inp2.nextInt();

        yuksekFaiz = 0.18;
        dusukFaiz = 0.08;

        // Calculation
        if (fiyat2 <=1000) {
            kdvTutar = fiyat2 * yuksekFaiz;
        } else {
            kdvTutar = fiyat2 * dusukFaiz;
        }

        System.out.println("Faiz Tutarı: " + kdvTutar );

    }
}
