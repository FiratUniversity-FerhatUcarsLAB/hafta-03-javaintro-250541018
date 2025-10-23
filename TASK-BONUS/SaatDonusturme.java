import java.util.Scanner;

public class SaatDonusturme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Saniye giriniz: ");
        int toplamSaniye = input.nextInt();

        int saat = toplamSaniye / 3600;
        int dakika = (toplamSaniye % 3600) / 60;
        int saniye = toplamSaniye % 60;

        System.out.printf("%d saniye = %d:%02d:%02d\n", toplamSaniye, saat, dakika, saniye);
    }
}
