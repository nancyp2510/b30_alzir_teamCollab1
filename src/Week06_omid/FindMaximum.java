package Week06_omid;


public class FindMaximum {

   public static int findMax(int[] number){

       if (number == null || number.length == 0){
           // using throw new IllegalArgumentException for expressive way to handle the case where the input array is either null or empty.
           throw new IllegalArgumentException("The Array list is empty or null");
       }

       int max = number[0]; //Assuming the first element is the maximum

       for (int i = 1; i < number.length; i++) {  //1 is used because we don't want to compare index 0 from                                             max but instead from second element which starts from 1.
            if (number[i] > max) {
                max = number[i]; //Updating the max if a larger element is found
            }
       }

       return max;

   }

    public static void main(String[] args) {

       int[] numbers = {5, 4, 6, 8, 9, 3, 7, 2, 10, 1};

        System.out.println("The maximum number is = " + findMax(numbers));
    }
}
