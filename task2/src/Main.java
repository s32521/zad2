import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static int znizkawiek(int wiek) {
        int znizkawiek = 0;
        if (wiek < 10) {
            znizkawiek = 100;
        } else if (wiek <= 18) {
            znizkawiek = 50;
        } else {
            znizkawiek = 0;
        }
        return znizkawiek;
    }

    public static int znizkamiasto(String miasto) {
        int znizkamiasto = 0;
        if (Objects.equals(miasto, "Warszawa") || Objects.equals(miasto, "warszawa")) {
            znizkamiasto = 10;
        }
        return znizkamiasto;
    }

    public static int znizkadzien(String dzien) {
        int znizkadzien = 0;
        if (Objects.equals(dzien, "Czwartek") || Objects.equals(dzien, "czwartek")) {
            znizkadzien = 100;
        }
        return znizkadzien;
    }

    public static void main(String[] args) {
        int cenar = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swój wiek:");
        int wiek = sc.nextInt();
        System.out.println("Podaj swoją miejscowość zamieszkania:");
        String miasto = sc.next();
        System.out.println("Podaj dzień tygodnia:");
        String dzien = sc.next();

        int cala = znizkawiek(wiek) + znizkamiasto(miasto)+ znizkadzien(dzien);

        int nowa=0;
        if(cala >=100) {
            cala=100;
        }else {
            nowa = cenar * (100 - cala) / 100;
        }
        System.out.println(miasto + "," + wiek + " " + "lat" + "," + dzien);
        System.out.println("Zniżka: " + cala + "%");
        System.out.println("Cena biletu: " + nowa);

    }
}