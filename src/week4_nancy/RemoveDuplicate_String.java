package week4_nancy;

public class RemoveDuplicate_String {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String input = scanner.next();
        scanner.close();
        System.out.println("Remove duplicate String output: " + removeDuplicate(input));
        */

     System.out.println("Remove duplicate String output: " + removeDuplicate("AAABBBCCC"));
    }

    public static String removeDuplicate(String input){
        String output ="";
        for(String each : input.split("")){
            if(!output.contains(each)){
                output += each;
            }
        }
        return output;
    }
}
/*
String
Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex:
removeDup (" AAABBBCCC")==> ABC
 */