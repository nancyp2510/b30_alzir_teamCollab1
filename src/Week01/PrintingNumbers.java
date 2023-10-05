package Week01;

public class PrintingNumbers {

    public static void main(String[] args) {

        for (int i = 1; i < 31; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
}