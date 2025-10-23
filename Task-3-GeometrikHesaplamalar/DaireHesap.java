public class DaireHesaplama {
    public static void main(String[] args) {
        double yaricap = 5.5;
        double alan = Math.PI * yaricap * yaricap;
        double cevre = 2 * Math.PI * yaricap;

        System.out.println("Daire Alan ve Çevre Hesaplama");
        System.out.println("-----------------------------");
        System.out.println("Yarıçap: " + yaricap);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}
