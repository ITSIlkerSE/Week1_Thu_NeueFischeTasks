public class Methods {
    public static void main(String[] args) {

        System.out.println(sumup(14, 22));
        System.out.println(next(14, 22));
    }


    public static int sumup (int value1, int value2){
        int sumup = value1 + value2;
        return sumup;

    }
    public static String next (int wert1, int wert2) {
        int curry = sumup(wert1, wert2);
        return "Summe: " + curry;
    }

}


