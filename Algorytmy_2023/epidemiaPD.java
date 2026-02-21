package ALGORYTMY;

public class epidemiaPD {
    public static void main(String[] args) {
        final int dni = 5;
        System.out.println("zdrowych: " + (10000 - epidemia(dni))
                + ", chorych: " + epidemia(dni));
    }

    static int epidemia(int dni) {
        int[] tab = new int[dni + 1];
        tab[1] = 10;

        for (int i = 2; i < tab.length; i++) {
            tab[i] = 2 * tab[i - 1] + tab[i - 1];
        }
        return tab[tab.length - 1];
    }
}
