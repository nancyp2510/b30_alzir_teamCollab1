public class SwapNumbers {


    //Swap numbers
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        System.out.println(num1);
        System.out.println(num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);
    }
    //Divisivle by 3 5 15.

    public static void main(String[] args) {

        String div3 = "Divisible by 3: ";
        String div5 = "Divisible by 5: ";
        String div15 = "Divisible by 15: ";


        for (int i = 1; i <=100 ; i++) {

            if (i %15 == 0){
                div15 += " " + i;
            } else if (i %3 == 0) {
                div3 += " "+i;

            } else if (i % 5 == 0) {
                div5+= " " +i;

            }

        }System.out.println(div3 + "\n" + div5 + "\n" + div15);




    }

    // Print consecutive numbers
    public static void main(String[] args) {


        int N = 24; // Replace with your desired positive integer N

        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }

            // If the number is not divisible by 2, 3, or 5, print the number itself
            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }

        }
    }
