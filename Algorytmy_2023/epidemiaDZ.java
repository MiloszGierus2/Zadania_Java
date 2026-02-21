package ALGORYTMY;

public class epidemiaDZ {
    public static void main(String[] args) {
        final int dni = 4;
        System.out.println("zdrowych: " + (10000 - epidemia(dni))
                + ", chorych: " + epidemia(dni));
    }

    static int epidemia(int dni){
        if (dni == 1){
            return 10;
        }
        else {
            return 2*epidemia(dni - 1) + epidemia(dni - 1);
        }
    }
}
