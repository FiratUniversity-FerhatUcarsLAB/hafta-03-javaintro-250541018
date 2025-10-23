public class UcgenHesaplama {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;

        double s = (a + b + c) / 2; // çevrenin yarısı
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double cevre = a + b + c;

        System.out.println("Üçgen Alan ve Çevre Hesaplama (Heron Formülü)");
        System.out.println("----------------------------------------------");
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}
