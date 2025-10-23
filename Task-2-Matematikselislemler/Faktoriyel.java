public class FaktoriyelHesapla {
    public static void main(String[] args) {
        int sayi = 5;
        int faktoriyel = 1;

        System.out.println(sayi + "! hesaplama adımları:");
      
        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;
            System.out.println(i + " ile çarpıldı → Sonuç: " + faktoriyel);
        }

        System.out.println("\nSonuç: " + sayi + "! = " + faktoriyel);
    }
}
