import java.util.Scanner;

public class BMIHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz (kg): ");
        double kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz (m): ");
        double boy = input.nextDouble();

        double bmi = kilo / (boy * boy);
        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", bmi);
    }
}
