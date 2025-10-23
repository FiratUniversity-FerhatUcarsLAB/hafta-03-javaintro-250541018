public class HesapOzeti {
    public static void main(String[] args) {
        String urun1 = "Kalem";
        int miktar1 = 3;
        double fiyat1 = 12.5;

        String urun2 = "Defter";
        int miktar2 = 2;
        double fiyat2 = 25.0;

        String urun3 = "Silgi";
        int miktar3 = 1;
        double fiyat3 = 5.75;

        double toplam = (miktar1 * fiyat1) + (miktar2 * fiyat2) + (miktar3 * fiyat3);

        System.out.println("============================================");
        System.out.println("Ürün\t\tMiktar\tFiyat (₺)\tTutar (₺)");
        System.out.println("============================================");
        System.out.printf("%-10s\t%d\t%.2f\t\t%.2f%n", urun1, miktar1, fiyat1, miktar1 * fiyat1);
        System.out.printf("%-10s\t%d\t%.2f\t\t%.2f%n", urun2, miktar2, fiyat2, miktar2 * fiyat2);
        System.out.printf("%-10s\t%d\t%.2f\t\t%.2f%n", urun3, miktar3, fiyat3, miktar3 * fiyat3);
        System.out.println("============================================");
        System.out.printf("TOPLAM TUTAR:\t\t\t\t%.2f ₺%n", toplam);
    }
}
