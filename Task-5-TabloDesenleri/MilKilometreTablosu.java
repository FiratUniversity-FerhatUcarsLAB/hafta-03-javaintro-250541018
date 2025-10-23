public class MilKilometreTablosu {
    public static void main(String[] args) {
        double km;
        System.out.println("Mil\tKilometre");
        int[] milDegerleri = {1, 5, 10, 20, 50};
        for (int mil : milDegerleri) {
            km = mil * 1.609;
            System.out.println(mil + "\t" + km);
        }
    }
}
