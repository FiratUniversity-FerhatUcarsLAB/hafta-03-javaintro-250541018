import java.util.Scanner;

public class ParaBozma {
    public static void main(String[] args) {
        int[] banknotlar = {100, 50, 20, 10, 5, 2, 1};
        Scanner input = new Scanner(System.in);

        System.out.print("Miktar giriniz (TL): ");
        int miktar = input.nextInt();

        System.out.println(miktar + " TL = ");
        for (int b : banknotlar) {
            int sayi = miktar / b;
            if (sayi > 0) {
                System.out.println(sayi + " x " + b + " TL");
                miktar %= b;
            }
        }
    }
}
